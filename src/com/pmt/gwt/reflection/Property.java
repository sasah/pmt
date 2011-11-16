package com.pmt.gwt.reflection;

import com.google.gwt.core.ext.typeinfo.JType;

/**
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet" Cooper</a>
 */
class Property {
	private MethodWrapper readMethod;
	private MethodWrapper writeMethod;
	private String name;
	private JType type;
	private boolean primaryKey;
	private boolean notNull;
	private boolean index;
	private boolean unique;
	private boolean desc;

	public Property() {
	}

	public MethodWrapper getReadMethod() {
		return readMethod;
	}

	public void setReadMethod(MethodWrapper readMethod) {
		this.readMethod = readMethod;
	}

	public MethodWrapper getWriteMethod() {
		return writeMethod;
	}

	public void setWriteMethod(MethodWrapper writeMethod) {
		this.writeMethod = writeMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JType getType() {
		return type;
	}

	public void setType(JType type) {
		this.type = type;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}

	public boolean isNotNull() {
		return notNull;
	}

	public void setIndex(boolean index) {
		this.index = index;
	}

	public boolean isIndex() {
		return index;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setDesc(boolean desc) {
		this.desc = desc;
	}

	public boolean isDesc() {
		return desc;
	}
}
