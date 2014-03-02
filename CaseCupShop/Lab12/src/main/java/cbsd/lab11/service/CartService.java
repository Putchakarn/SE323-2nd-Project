package cbsd.lab11.service;





import cbsd.lab11.entity.Cart;
import cbsd.lab11.entity.Customer;

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