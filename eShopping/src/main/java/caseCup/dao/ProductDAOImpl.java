package caseCup.dao;


import caseCup.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ProductDAOImpl implements ProductDAO, ProductCDAO {

    @Autowired
	private SessionFactory sessionFactory;






    @Override
    public Set<Product> getProducts() {
        List<Product> products = sessionFactory.getCurrentSession().createQuery("from Product").list();

        return new HashSet<Product>(products);
    }

    @Override
    public List<Product> getProductsByWord(String name) {
        return sessionFactory.getCurrentSession().createQuery
                ("from Product p where p.name = '" + name +"'").list();
    }

    /**
	 * 
	 * @param brand
	 */
	public List<Product> getProductsByBrand(String brand) {
        return sessionFactory.getCurrentSession().createQuery
                ("from Product p where p.name = '" + brand +"'").list();
	}

	/**
	 * 
	 * @param product
	 */
	public void addProduct(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	/**
	 * 
	 * @param product
	 */
	public void updateProduct(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	/**
	 * 
	 * @param product
	 */
	public void deleteProduct(Product product) {
        sessionFactory.getCurrentSession().delete(product);
	}

}