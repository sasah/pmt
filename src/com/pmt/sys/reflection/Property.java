package com.pmt.sys.reflection;

/**
 * A container for information about a Property on a type.
 * 
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet" Cooper</a>
 */
public class Property {
	@SuppressWarnings("rawtypes")
	private Class type;
	private Method accessorMethod;
	private Method mutatorMethod;
	private String name;
	private boolean primaryKey;
	private boolean notNull;
	private boolean index;
	private boolean unique;
	private boolean desc;
	private boolean autoIncrement;

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
	public Property(String name, @SuppressWarnings("rawtypes") Class type, Method accessorMethod, Method mutatorMethod, boolean primaryKey,
			boolean notNull, boolean index, boolean unique, boolean desc, boolean autoIncrement) {
		this.name = name;
		this.accessorMethod = accessorMethod;
		this.mutatorMethod = mutatorMethod;
		this.type = type;
		this.primaryKey = primaryKey;
		this.notNull = notNull;
		this.index = index;
		this.unique = unique;
		this.desc = desc;
		this.autoIncrement = autoIncrement;
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

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public boolean isNotNull() {
		return notNull;
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

	public boolean isIndex() {
		return index;
	}

	public boolean isUnique() {
		return unique;
	}

	public boolean isDesc() {
		return desc;
	}

	public boolean isAutoIncrement() {
		return autoIncrement;
	}
}
