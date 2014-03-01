package caseCup.dao;

import caseCup.entity.Customer;

public interface CustomerCDAO {

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