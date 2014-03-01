package caseCup.controller;

import caseCup.entity.Cart;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import caseCup.service.CartService;

public class CartController {

	private CartService cartService;

	/**
	 * 
	 * @param cart
	 * @param bindingResult
	 * @param model
	 */
	public String addCart(Cart cart, BindingResult bindingResult, Model model) {
		// TODO - implement CartController.addCart
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cart
	 * @param model
	 */
	public String updateCart(Cart cart, Model model) {
		// TODO - implement CartController.updateCart
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param model
	 */
	public String cartHistories(Model model) {
		// TODO - implement CartController.cartHistories
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param model
	 */
	public String cartSaved(String id, Model model) {
		// TODO - implement CartController.cartSaved
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param model
	 */
	public String customerCartHistories(String id, Model model) {
		// TODO - implement CartController.customerCartHistories
		throw new UnsupportedOperationException();
	}

}