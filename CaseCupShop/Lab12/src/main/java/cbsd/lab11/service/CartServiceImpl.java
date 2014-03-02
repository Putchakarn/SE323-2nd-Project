package cbsd.lab11.service;


import cbsd.lab11.dao.CartCDAO;
import cbsd.lab11.dao.CartDAO;
import cbsd.lab11.entity.Cart;
import cbsd.lab11.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
	private CartDAO cartDAO;
    @Autowired
    private CartCDAO cartCDAO;


    @Override
    @Transactional
	public List<Cart> getCarts() {
		return cartDAO.getCarts();
	}

	/**
	 * 
	 * @param id
	 */
    @Override
    @Transactional
	public Cart getCartById(String id) {
		return cartDAO.getCartById(id);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public List<Cart> getCartHistories(Customer customer) {
		return cartDAO.getCartHistories(customer);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public Cart getSavedCart(Customer customer) {
	    return cartDAO.getSavedCart(customer);
	}

	/**
	 * 
	 * @param cart
	 */
    @Override
    @Transactional
	public void updateCart(Cart cart) {
        cartCDAO.updateCart(cart);
	}

	/**
	 * 
	 * @param cart
	 */
    @Override
    @Transactional
	public void addCart(Cart cart) {
        cartCDAO.addCart(cart);
	}



}