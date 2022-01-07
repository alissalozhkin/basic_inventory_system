package controllers;

import use_cases.InventoryUseCases;


/**
 * This class manages the user's inventory
 */
public class ListManager {
	private final InventoryUseCases inventoryUseCases;

	/**
	 * Initialize a ListManager by setting up the user's
	 * inventory
	 */
	public ListManager(InventoryUseCases inventoryUseCases) {
		this.inventoryUseCases = inventoryUseCases;
	}

	/**
	 * Return the user's inventory that will be printed to the user.
	 *
	 * @return the user's inventory.
	 */
	public String printInventory() {
		return inventoryUseCases.returnInventory();
	}

	/**
	 * Add the given item (name, quantity, and possibly expiry date) to
	 * the user's inventory.
	 *
	 * @param name          the name of the item being added.
	 * @param quantity      the quantity of the item being added.
	 */
	public void addInventoryItem(String name, int quantity) {
		inventoryUseCases.addInventoryItem(name, quantity);
	}

	/**
	 * Remove the item at the given index from the user's inventory.
	 *
	 * @param index the index of the item to be removed.
	 */
	public void removeInventoryItem(int index) {
		inventoryUseCases.removeInventoryItem(index);
	}

}
