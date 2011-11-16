package com.pmt.gwt.reflection;

import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.core.ext.typeinfo.JType;

/**
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet" Cooper</a>
 */
public class MethodWrapper implements Comparable<MethodWrapper> {

	private JType declaringType;
	private JMethod baseMethod;
	boolean hashWithType = false;

	public MethodWrapper(JType declaringType, JMethod baseMethod) {
		if (declaringType == null) {
			throw new NullPointerException("declaringType cannot be null.");
		}
		if (baseMethod == null) {
			throw new NullPointerException("baseMethod cannot be null.");
		}
		this.declaringType = declaringType;
		this.baseMethod = baseMethod;
	}

	public JType getDeclaringType() {
		return declaringType;
	}

	public JMethod getBaseMethod() {
		return baseMethod;
	}

	public String toString() {
		return (hashWithType ? this.declaringType.getQualifiedSourceName() : "") + this.baseMethod.getReadableDeclaration(false, true, false, true, true);
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public int compareTo(MethodWrapper o) {
		if (o == null) {
			return -1;
		}
		return this.toString().compareTo(o.toString());
	}

	public boolean equals(MethodWrapper o) {
		return this.compareTo(o) == 0;
	}
}
