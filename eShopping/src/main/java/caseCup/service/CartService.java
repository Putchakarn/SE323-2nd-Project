package caseCup.service;


import caseCup.entity.Cart;
import caseCup.entity.Customer;

import java.util.List;

public interface CartService {

	List<Cart> getCarts();

	/**
	 * 
	 * @param id
	 */
	Cart getCartById(String id);

	/**
	 * 
	 * @param customer
	 */
	List<Cart> getCartHistories(Customer customer);

	/**
	 * 
	 * @param customer
	 */
	Cart getSavedCart(Customer customer);

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