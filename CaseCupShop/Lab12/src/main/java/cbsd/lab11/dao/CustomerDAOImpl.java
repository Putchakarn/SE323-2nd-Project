package cbsd.lab11.dao;

import cbsd.lab11.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class CustomerDAOImpl implements CustomerDAO, CustomerCDAO {

    @Autowired
	private SessionFactory sessionFactory;


    public CustomerDAOImpl() {
    }

    @Override
    public Set<Customer> getCustomers() {

        List<Customer> customers = sessionFactory.getCurrentSession().createQuery("from Customer").list();

        return new HashSet<Customer>(customers);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
	public void addCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	/**
	 * 
	 * @param customer
	 */
    @Override
	public void updateCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

}