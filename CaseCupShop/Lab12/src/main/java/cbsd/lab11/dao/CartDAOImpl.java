package cbsd.lab11.dao;

import cbsd.lab11.entity.Cart;
import cbsd.lab11.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDAOImpl implements CartDAO, CartCDAO {

    @Autowired
	private SessionFactory sessionFactory;


    @Override
	public List<Cart> getCarts() {
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

	/**
	 * 
	 * @param id
	 */
    @Override
	public Cart getCartById(String id) {
		return (Cart) sessionFactory.getCurrentSession().get(Cart.class,id);
	}

	/**
	 * 
	 * @param customer get Cart history of customer ***********************************************************
	 */
    @Override
	public List<Cart> getCartHistories(Customer customer) {
        return sessionFactory.getCurrentSession().createQuery("from Cart c where c.customer=  " + customer).list();
	}

	/**
	 * 
	 * @param customer  get not finish cart of custome 
	 */
    @Override
	public Cart getSavedCart(Customer customer) {
        return (Cart)sessionFactory.getCurrentSession().createQuery("from Cart c where c.customerId = " + customer.getId() + " and c.status = false").uniqueResult();

    }

	/**
	 * 
	 * @param cart
	 */
    @Override
	public void updateCart(Cart cart) {
        sessionFactory.getCurrentSession().saveOrUpdate(cart);

    }

	/**
	 * 
	 * @param cart
	 */
    @Override
	public void addCart(Cart cart) {
        sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

}