package ReverseAuctionSystem;

public class Item
{
	private String description;
	private String location;

	public Item(String description, String location)
	{
		super();
		this.description = description;
		this.location = location;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getLocation()
	{
		return location;
	}
	/**
	 * // equality test
	 *
	 * @Override public boolean equals (Object o) { if(o == null) return false;
	 *           else if(o.getClass() != this.getClass()) return false; else {
	 *           Item item = (Item)o; return item.id == this.id &&
	 *           item.description.equals(this.description); } }
	 */
	// need to override hashcode as well for equality test
	// @Override
	// public int hashCode()
	// {
	// return this.id ^ this.description.hashCode();
	// }
}
