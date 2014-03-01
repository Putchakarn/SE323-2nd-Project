package caseCup.controller;

import caseCup.entity.Customer;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import caseCup.service.CustomerService;

public class CustomerContoller {

	private CustomerService customerService;

	/**
	 * 
	 * @param model
	 */
	public String callRegistPage(Model model) {
		// TODO - implement CustomerContoller.callRegistPage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param model
	 */
	public String updateCustomer(String id, Model model) {
		// TODO - implement CustomerContoller.updateCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param bindingResult
	 * @param model
	 */
	public String addValidCustomer(Customer customer, BindingResult bindingResult, Model model) {
		// TODO - implement CustomerContoller.addValidCustomer
		throw new UnsupportedOperationException();
	}

}