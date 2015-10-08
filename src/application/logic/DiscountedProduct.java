package application.logic;

import application.logic.Product;

import java.lang.System;

/**
 *  Subclass representing a  discounted product to be 
 *  purchased for the second assignment in DIT948, 2015 edition.
 *  It extends the <tt>Product<tt> class with two instance 
 *  variables
 */

public class DiscountedProduct extends Product {

	// Original product
	private final Product original;

	// Discount in percent (%)
	private final double discount;


	/**
	 * Construct a discounted product
	 * @param original
	 * @param discount
	 */
	public DiscountedProduct(Product original, double discount) {
		super(original);

		// if the price can not be reduced you should print a message and
		// terminate the program. Use "System.exit(0);" to terminate.
		// code here
		if (!original.canBeReduced()) {
			System.out.println("Error! Shutting down.");
			System.exit(0);
		}

		this.original = original;
		this.discount = discount;

	}



	/**
	 * Return the price of this discounted product
	 * @param cart shopping cart
	 * @return discounted price 
	 */
	public double getPrice(Cart cart) {
	       // code here
		return original.getPrice() * (1 - discount / 100);
	}

	/**
	 * Return the string representation of the product
	 * Example: CD [discounted 20 %] 
	 */
	public String toString() {
	       // code here
		return original.getName() + "[discounted " + discount + "%]";
	}
}
