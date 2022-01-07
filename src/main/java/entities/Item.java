package entities;


/**
 * This class represents an item that has a name and quantity.
 */
public class Item implements Comparable<Item> {
	private final String name;
	private int quantity;

	/**
	 * Initialize an Item with the given name and quantity.
	 *
	 * @param name 		name of item.
	 * @param quantity 	quantity of item.
	 */
	public Item(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	/**
	 * Update the quantity of the item by adding the given newAmount.
	 *
	 * @param newAmount the amount being added to the item quantity.
	 */
	public void updateQuantity(int newAmount) {
		this.quantity += newAmount;
	}

}
  
