package cbsd.lab11.dao;


import cbsd.lab11.entity.Cart;
import cbsd.lab11.entity.Customer;

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