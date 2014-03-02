package cbsd.lab11.dao;


import cbsd.lab11.entity.Cart;

public interface CartCDAO {

	/**
	 * 
	 * @param cart
	 */
	void updateCart(Cart cart);

	/**
	 * 
	 * @param cart
	 */
	void addCart(Cart cart);

}