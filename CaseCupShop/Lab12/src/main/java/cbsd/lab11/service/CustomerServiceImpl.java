package cbsd.lab11.service;


import cbsd.lab11.dao.CustomerCDAO;
import cbsd.lab11.dao.CustomerDAO;
import cbsd.lab11.entity.Customer;
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