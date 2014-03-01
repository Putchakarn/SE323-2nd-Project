package caseCup.service;


import caseCup.dao.CustomerCDAO;
import caseCup.dao.CustomerDAO;
import caseCup.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
	private CustomerDAO customerDAO;
    @Autowired
	private CustomerCDAO customerCDAO;

    @Override
    @Transactional
	public Set<Customer> getCustomers() {
		return getCustomers();
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public void addCustomer(Customer customer) {
		addCustomer(customer);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
    @Transactional
	public void updateCustomer(Customer customer) {
		updateCustomer(customer);
	}

}