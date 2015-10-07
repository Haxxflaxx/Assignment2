package application.logic;

/**
 *  Class representing a shopping cart for the
 *  second assignment in DIT948, 2015 edition.
 */

public class Cart  {

	// array of products (max 100 products)
	private final Product[] products = new Product[100];

	//position of the first free cell to add a product
	private int position =0;
	
	/**
	 * Return the list of products
	 * @return
	 */
	public Product[] getProducts(){
	       // code here
	}
	
	/**
	 * Add a product to the list
	 * @param product
	 */
	public void addProduct(Product product) {
	       // code here
	}

	/**
	 * Add an array of products to the list
	 * @param products
	 */
	public void addProducts(Product[] products) {
	       // code here
	}

	/**
	 * Adds a product several times
	 * @param product
	 * @param howManyTimes number of times to add product 
	 */
	public void addProduct(Product product, int howManyTimes) {
	       // code here
	}
	
	/**
	 * Calculate the total price
	 * @return
	 */
	public double totalPrice(){
	       // code here
	}

	/**
	 * String representation of products in a shopping 
	 * cart
	 * Example: 
	 * CD of Leonard Cohen 22.50 SEK. Sold by Javier
         * TV [discounted by 20.00%]    4000.00 SEK. Sold by Maria
	 */
	public String toString() {
		String result = "";
	       // code here
		return result;
	}

}
