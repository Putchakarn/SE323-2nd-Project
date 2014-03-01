package caseCup.service;


import caseCup.dao.CartDAO;
import caseCup.entity.Cart;
import caseCup.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
	private CartDAO cartDAO;

    @Override
    @Transactional
	public List<Cart> getCarts() {
		return getCarts();
	}

	/**
	 * 
	 * @param id
	 */
    @Override
    @Transactional
	public Cart getCartById(String id) {
		return getCartById(id);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public List<Cart> getCartHistories(Customer customer) {
		return getCartHistories(customer);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public Cart getSavedCart(Customer customer) {
	    return getSavedCart(customer);
	}

	/**
	 * 
	 * @param cart
	 */
    @Override
    @Transactional
	public void updateCart(Cart cart) {
		updateCart(cart);
	}

	/**
	 * 
	 * @param cart
	 */
    @Override
    @Transactional
	public void addCart(Cart cart) {
	    addCart(cart);
	}



}