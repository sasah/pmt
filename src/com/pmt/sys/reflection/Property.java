package com.pmt.sys.reflection;

/**
 * A container for information about a Property on a type.
 */
public class Property {
	@SuppressWarnings("rawtypes")
	private Class type;
	private Method accessorMethod;
	private Method mutatorMethod;
	private String name;

	/**
	 * Creates a new instance of Property
	 * 
	 * @param name
	 *            Name of the property
	 * @param type
	 *            Class literal type of the property
	 * @param accessorMethod
	 *            The accessor method for the property.
	 * @param mutatorMethod
	 *            The mutator method for the property.
	 */
	public Property(String name, @SuppressWarnings("rawtypes") Class type, Method accessorMethod, Method mutatorMethod) {
		this.name = name;
		this.accessorMethod = accessorMethod;
		this.mutatorMethod = mutatorMethod;
		this.type = type;
	}

	/**
	 * Returns the accessor method for the property.
	 * 
	 * @return The accessor method for the property.
	 */
	public Method getAccessorMethod() {
		return accessorMethod;
	}

	/**
	 * Returns the mutator method for the property.
	 * 
	 * @return The mutator method for the property.
	 */
	public Method getMutatorMethod() {
		return mutatorMethod;
	}

	/**
	 * Returns the name of the property.
	 * 
	 * @return Name of the property.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the Class literal type of the property.
	 * 
	 * @return Class literal type of the property.
	 */
	@SuppressWarnings("rawtypes")
	public Class getType() {
		return type;
	}

	/**
	 * String representation.
	 * 
	 * @return String representation.
	 */
	public String toString() {
		return "Property[ name=" + name + " ]";
	}
}
