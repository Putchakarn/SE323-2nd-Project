package cbsd.lab11.dao;


import cbsd.lab11.entity.Customer;

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