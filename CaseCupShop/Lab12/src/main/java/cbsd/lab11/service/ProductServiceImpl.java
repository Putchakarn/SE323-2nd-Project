package cbsd.lab11.service;


import cbsd.lab11.dao.ProductDAO;
import cbsd.lab11.entity.Category;
import cbsd.lab11.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDAO productDAO;


    @Override
    @Transactional
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    @Transactional
    public void removeProduct(Long id) {

    }

    @Override
    @Transactional
    public Product findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public Set<Product> getProducts() {
        return productDAO.getProducts();
    }

    @Override
    @Transactional
    public Set<Product> getProductByCategory(Category category) {
        return null;
    }

    @Override
    @Transactional
    public Product getProductById(Long id) {
        return null;
    }
}
