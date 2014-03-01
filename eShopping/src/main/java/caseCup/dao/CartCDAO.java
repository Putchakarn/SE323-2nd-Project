package caseCup.dao;

import caseCup.entity.Cart;

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