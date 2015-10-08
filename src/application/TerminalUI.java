package application;

import application.logic.Buy2Take3Product;
import application.logic.Cart;
import application.logic.DiscountedProduct;
import application.logic.Product;

import java.util.Scanner;

/**
 *  Class representing a shopping cart application for the
 *  second assignment in DIT948, 2015 edition.
 *  This is the main class for the application, interacting
 *  with the customer, adding to the cart different product to 
 *  be purchased and finally calculating the total amount to be payed
 */

public class TerminalUI {
	
	/**
	 *  Allows a shopkeeper to enter the details for a product
	 *  to be purchased by a customer
	 *  @param cart the shopping cart of a given customer
	 */
	public static void askCustomer(Cart cart){
		Product p;
		Scanner input = new Scanner(System.in);
		String name = "";
		String seller = "";
		double price = 0.0;
		int quantity = 0;
		double discount = 0.0;
		char take3f2 = 'n';

		System.out.println("Enter product name:");
		name = input.nextLine();

		System.out.println("Seller:");
		seller = input.nextLine();

		System.out.println("Price:");
		price = input.nextDouble();

		System.out.println("Quantity:");
		quantity = input.nextInt();

		System.out.println("Discount(%):");
		discount = input.nextDouble();

		System.out.println("Take 3 pay for 2? (Y/N)");
		take3f2 = input.next().charAt(0);

		p = new Product(seller, name, price);

		if (discount > 0){
			p = new DiscountedProduct(p, discount);
		}
		else if (Character.toLowerCase(take3f2) == 'y'){
			p = new Buy2Take3Product(p);
		}

		if (quantity == 1) cart.addProduct(p);
		else if (quantity < 1) cart.addProduct(p, quantity);

		// Code to read from console the product name, seller,
		// price, number of products, discount and
		// if Buy2Take 3 applies.
	
		// Then create a product of the correct type
		// and add it to the shopping cart	
	 }

	/**
	 * Method to ask the user for input using the terminal.
 	 */
	public static void ask() {
		Cart cart = new Cart();
		Scanner userInput = new Scanner(System.in);
		boolean loop = true;
		String customer;

		System.out.println("Welcome to DIT958 shop");
		System.out.println("What's your name?");
		customer = userInput.nextLine();
		System.out.println("Hi " + customer + ". Please choose one of the following options:");
		System.out.println("");
		 
		while(loop){
			System.out.println("0 to add product or 1 to checkout.");
			try {
				switch (userInput.nextInt()) {
					case 0:
						askCustomer(cart);
						break;

					case 1:
						loop = false;

										break;

					default:
						System.out.println("Wrong number entered.");
				}
			}
			catch (java.lang.NumberFormatException e){
				System.out.println("Error! faulty input.");
			}

		}

		//Implement the user interface here
		// Ask the user to choose 0 (buy product) or
		// 1 (checkout), depending on  what they want to do
		// See TestCases.txt for several examples

	}
}
