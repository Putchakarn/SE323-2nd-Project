package cbsd.lab11.service;



import cbsd.lab11.entity.Customer;

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