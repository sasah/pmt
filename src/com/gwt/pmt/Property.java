package com.gwt.pmt;

import com.google.gwt.core.ext.typeinfo.JType;

class Property {
	private MethodWrapper readMethod;
	private MethodWrapper writeMethod;
	private String name;
	private JType type;

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

}
