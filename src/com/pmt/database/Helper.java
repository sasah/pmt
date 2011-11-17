package com.pmt.database;

import com.pmt.sys.reflection.BeanDescriptor;
import com.pmt.sys.reflection.Introspector;
import com.pmt.sys.reflection.Property;

public class Helper {
	public static String createTable(Object entity) throws Exception {
		BeanDescriptor bd = Introspector.INSTANCE.getDescriptor(entity);
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE IF NOT EXISTS ");
		sb.append(bd.getTableName());
		sb.append("(");
		boolean f = true;
		int keys = 0;
		for (Property pr : bd.getProperties()) {
			if (f) {
				f = false;
			} else {
				sb.append(",");
			}
			sb.append(pr.getName());
			if ((pr.getType().getName() == "java.lang.Integer") || (pr.getType().getName() == "int") || (pr.getType().getName() == "boolean")
					|| (pr.getType().getName() == "java.lang.Boolean")) {
				sb.append(" INTEGER");
			} else if ((pr.getType().getName() == "double") || (pr.getType().getName() == "java.lang.Double")) {
				sb.append(" REAL");
			} else if (pr.getType().getName() == "java.lang.String") {
				sb.append(" TEXT");
			} else {
				throw new Exception("Unsupported column type " + pr.getType().getName());
			}
			if (pr.isPrimaryKey()) {
				if (keys > 0) {
					throw new Exception("PRIMARY KEY not single");
				}
				sb.append(" PRIMARY KEY");
				if (pr.isDesc()) {
					sb.append(" DESC");
				}
				if (pr.isAutoIncrement()) {
					sb.append(" AUTOINCREMENT");
				}
				if (pr.isIndex()) {
					throw new Exception("PRIMARY KEY unsupport INDEX");
				}
				if (pr.isNotNull()) {
					throw new Exception("PRIMARY KEY unsupport NOT NULL");
				}
				if (pr.isUnique()) {
					throw new Exception("PRIMARY KEY unsupport UNIQUE");
				}
				keys++;
			} else {
				if (pr.isNotNull()) {
					sb.append(" NOT NULL");
				}
				if (pr.isUnique()) {
					sb.append(" UNIQUE");
					if (pr.isIndex()) {
						throw new Exception("UNIQUE unsupport INDEX");
					}
				}
				if (pr.isDesc()) {
					if (!pr.isIndex()) {
						throw new Exception("DESC is alone");
					}
				}
			}
		}
		sb.append(")");
		return sb.toString();
	}

	public static String insert(Object entity) throws Exception {
		BeanDescriptor bd = Introspector.INSTANCE.getDescriptor(entity);
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(bd.getTableName());
		sb.append("(");
		boolean f = true;
		boolean primaryKeySet = false;
		for (Property pr : bd.getProperties()) {
			if (pr.isPrimaryKey()) {
				if (pr.isAutoIncrement()) {
					if ((pr.getType().getName() == "java.lang.Integer") || (pr.getType().getName() == "int")) {
						Integer id = (Integer) pr.getAccessorMethod().invoke(entity, null);
						if (id != null) {
							if (id.intValue() > 0) {
								throw new Exception("Auto increment primary key " + pr.getName() + " must be null or 0");
							}
						}
						continue;
					} else {
						throw new Exception("Unsupported auto increment primary key column type " + pr.getType().getName());
					}
				} else {
					if ((pr.getType().getName() == "int") || (pr.getType().getName() == "java.lang.Integer")) {
						Integer id = (Integer) pr.getAccessorMethod().invoke(entity, null);
						if (id != null) {
							if (id.intValue() > 0) {
								primaryKeySet = true;
							} else {
								continue;
							}
						} else {
							continue;
						}
					} else if ((pr.getType().getName() == "boolean") || (pr.getType().getName() == "java.lang.Boolean")) {
						Boolean id = (Boolean) pr.getAccessorMethod().invoke(entity, null);
						if (id != null) {
							primaryKeySet = true;
						} else {
							continue;
						}
					} else if ((pr.getType().getName() == "double") || (pr.getType().getName() == "java.lang.Double")) {
						Double id = (Double) pr.getAccessorMethod().invoke(entity, null);
						if (id != null) {
							if (id.doubleValue() > 0) {
								primaryKeySet = true;
							} else {
								continue;
							}
						} else {
							continue;
						}
					} else if (pr.getType().getName() == "java.lang.String") {
						String id = (String) pr.getAccessorMethod().invoke(entity, null);
						if (id != null) {
							if (id.length() > 0) {
								primaryKeySet = true;
							} else {
								continue;
							}
						} else {
							continue;
						}
					} else {
						throw new Exception("Unsupported column type " + pr.getType().getName());
					}
				}
			} else {
				Object field = pr.getAccessorMethod().invoke(entity, null);
				if (field == null) {
					if (pr.isNotNull()) {
						throw new Exception("Field " + pr.getName() + " must have value");
					} else {
						continue;
					}
				} else {
					if (pr.getType().getName() == "java.lang.String") {
						if (pr.isNotNull()) {
							if (((String) field).length() == 0) {
								throw new Exception("Field " + pr.getName() + " must have value");
							}
						}
					}
				}
			}
			if (f) {
				f = false;
			} else {
				sb.append(",");
			}
			sb.append(pr.getName());
		}
		sb.append(") VALUES(");
		f = true;
		for (Property pr : bd.getProperties()) {
			if (f) {
				f = false;
			} else {
				sb.append(",");
			}
			Object field = pr.getAccessorMethod().invoke(entity, null);
			if (field != null) {
				sb.append("'");
				sb.append(field.toString());
				sb.append("'");
			} else {
				sb.append("NULL");
			}
		}
		sb.append(")");
		return sb.toString();
	}
}
