package caseCup.service;

import caseCup.entity.Customer;

import java.util.Set;

public interface CustomerService {

	Set<Customer> getCustomers();

	/**
	 * 
	 * @param customer
	 */
	void addCustomer(Customer customer);

	/**
	 * 
	 * @param customer
	 */
	void updateCustomer(Customer customer);

}