package cbsd.lab11.dao;


import cbsd.lab11.entity.Customer;

import java.util.Set;

public interface CustomerDAO {

	Set<Customer> getCustomers();

}