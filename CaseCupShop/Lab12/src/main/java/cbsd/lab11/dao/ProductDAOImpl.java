package cbsd.lab11.dao;


import cbsd.lab11.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<Product> getProducts() {
        List productList = sessionFactory.getCurrentSession().createQuery("from Product").list();
        return new HashSet<Product>(productList);
    }

    @Override
    public Product getProductById(Long id) {
       return null;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
    }

    @Override
    public void removeProduct(Long id) {
    }

    @Override
    public Product findById(Long id) {
        return null;
    }
}
