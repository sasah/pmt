package com.pmt.gwt.reflection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JField;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.pmt.database.annotation.AutoIncrement;
import com.pmt.database.annotation.Desc;
import com.pmt.database.annotation.Index;
import com.pmt.database.annotation.NotNull;
import com.pmt.database.annotation.PrimaryKey;
import com.pmt.database.annotation.Unique;
import com.pmt.sys.reflection.Transient;

/**
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet" Cooper</a>
 */
public class BeanResolver {
	private HashMap<String, Property> properties = new HashMap<String, Property>();

	private HashSet<MethodWrapper> methodSet = new HashSet<MethodWrapper>();
	private HashMap<String, JField> fieldsSet = new HashMap<String, JField>();

	private JClassType type;
	private TreeLogger logger;

	public BeanResolver(TreeLogger logger, JClassType type) {
		this.type = type;
		this.logger = logger;
		this.logger = logger.branch(TreeLogger.DEBUG, "Inspecting type: " + type.getQualifiedSourceName(), null);

		buildMethods(type);
		buildFields(type);
		examineGetters();
		examineSetters();

		logger.log(TreeLogger.DEBUG, "" + methodSet.size(), null);

		for (Iterator<String> it = properties.keySet().iterator(); it.hasNext();) {
			logger.log(TreeLogger.DEBUG, (String) it.next(), null);
		}

		for (Iterator<MethodWrapper> it = methodSet.iterator(); it.hasNext();) {
			MethodWrapper w = it.next();
			logger.log(TreeLogger.DEBUG, w.getDeclaringType().getQualifiedSourceName() + " " + w.toString(), null);
		}
	}

	private void buildMethods(JClassType type) {

		JMethod[] methods = type.getMethods();
		logger = logger.branch(TreeLogger.DEBUG, type.getQualifiedSourceName() + " " + type.getMethods().length, null);

		for (int i = 0; i < methods.length; i++) {
			if (!methods[i].isPublic()) {
				continue;
			}

			MethodWrapper w = new MethodWrapper(type, methods[i]);
			if (methods[i].getAnnotation(Transient.class) != null) {
				methodSet.remove(w);
			} else {
				logger.log(TreeLogger.DEBUG, w.getBaseMethod().getReadableDeclaration(), null);
				methodSet.add(w);
			}
		}

		JClassType[] interfaces = type.getImplementedInterfaces();

		for (int i = 0; i < interfaces.length; i++) {
			buildMethods(interfaces[i]);
		}

		if (type.getSuperclass() != null) {
			buildMethods(type.getSuperclass());
		} else {
			logger.log(TreeLogger.DEBUG, "no supertype", null);
		}
	}

	private void buildFields(JClassType type) {
		JField[] fields = type.getFields();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getAnnotation(Transient.class) != null) {
				fieldsSet.remove(fields[i]);
			} else {
				fieldsSet.put(fields[i].getName(), fields[i]);
			}
		}
		JClassType[] interfaces = type.getImplementedInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			buildFields(interfaces[i]);
		}
		if (type.getSuperclass() != null) {
			buildFields(type.getSuperclass());
		}
	}

	private void examineGetters() {
		for (Iterator<MethodWrapper> it = methodSet.iterator(); it.hasNext();) {
			MethodWrapper w = it.next();
			String methodName = w.getBaseMethod().getName();
			Property p = null;

			if (methodName.startsWith("get") && (methodName.length() >= 4) && (methodName.charAt(3) == methodName.toUpperCase().charAt(3)) && (methodName != "getClass")) {
				p = new Property();
				p.setReadMethod(w);
				p.setName(methodName.substring(3, 4).toLowerCase() + ((methodName.length() > 4) ? methodName.substring(4, methodName.length()) : ""));
				JField field = fieldsSet.get(p.getName());
				if (field != null) {
					p.setPrimaryKey(field.getAnnotation(PrimaryKey.class) != null);
					p.setNotNull(field.getAnnotation(NotNull.class) != null);

					p.setIndex(field.getAnnotation(Index.class) != null);
					p.setUnique(field.getAnnotation(Unique.class) != null);
					p.setDesc(field.getAnnotation(Desc.class) != null);
					p.setAutoIncrement(field.getAnnotation(AutoIncrement.class) != null);
				}
			} else if (methodName.startsWith("is") && (methodName.length() >= 3) && (methodName.charAt(2) == methodName.toUpperCase().charAt(2))) {
				p = new Property();
				p.setReadMethod(w);
				p.setName(methodName.substring(2, 3).toLowerCase() + ((methodName.length() > 3) ? methodName.substring(3, methodName.length()) : ""));
				JField field = fieldsSet.get(p.getName());
				if (field != null) {
					p.setPrimaryKey(field.getAnnotation(PrimaryKey.class) != null);
					p.setNotNull(field.getAnnotation(NotNull.class) != null);

					p.setIndex(field.getAnnotation(Index.class) != null);
					p.setUnique(field.getAnnotation(Unique.class) != null);
					p.setDesc(field.getAnnotation(Desc.class) != null);
					p.setAutoIncrement(field.getAnnotation(AutoIncrement.class) != null);
				}
			}

			if (p == null) {
				continue;
			}

			p.setType(w.getBaseMethod().getReturnType());
			logger.log(TreeLogger.DEBUG, "Found new property: " + p.getName(), null);
			properties.put(p.getName(), p);
		}
	}

	private void examineSetters() {
		for (Iterator<MethodWrapper> it = methodSet.iterator(); it.hasNext();) {
			MethodWrapper w = it.next();
			String methodName = w.getBaseMethod().getName();

			if (methodName.startsWith("set") && (methodName.length() >= 4) && (methodName.charAt(3) == methodName.toUpperCase().charAt(3))) {
				String name = methodName.substring(3, 4).toLowerCase() + ((methodName.length() > 4) ? methodName.substring(4, methodName.length()) : "");

				Property p = (properties.containsKey(name) ? properties.get(name) : new Property());
				p.setName(name);
				p.setWriteMethod(w);

				if ((p.getType() == null) && (w.getBaseMethod().getParameters() != null) && (w.getBaseMethod().getParameters().length > 0)) {
					p.setType(w.getBaseMethod().getParameters()[w.getBaseMethod().getParameters().length - 1].getType());
				}

				if (logger.isLoggable(TreeLogger.DEBUG)) {
					if (properties.get(p.getName()) == null) {
						logger.log(TreeLogger.DEBUG, "Found new property on setter: " + p.getName(), null);
					}
				}

				properties.put(p.getName(), p);
			}
		}
	}

	Map<String, Property> getProperties() {
		return this.properties;
	}

	public JClassType getType() {
		return this.type;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof BeanResolver) {
			return ((BeanResolver) object).getType().getQualifiedSourceName().equals(this.getType().getQualifiedSourceName());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.getType().getQualifiedSourceName().hashCode();
	}

	@Override
	public String toString() {
		return this.getType().getQualifiedSourceName();
	}
}
