package caseCup.dao;

import caseCup.entity.Cart;
import caseCup.entity.Customer;

import java.util.List;

public interface CartDAO {

	List getCarts();

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

}