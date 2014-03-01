package caseCup.dao;

import caseCup.entity.Customer;

import java.util.Set;

public interface CustomerDAO {

	Set<Customer> getCustomers();

}