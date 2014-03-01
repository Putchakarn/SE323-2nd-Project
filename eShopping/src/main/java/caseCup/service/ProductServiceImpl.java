package caseCup.service;


import caseCup.dao.ProductCDAO;
import caseCup.dao.ProductDAO;
import caseCup.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
	private ProductDAO productDAO;
    @Autowired
	private ProductCDAO productCDAO;

    @Override
    @Transactional
	public Set<Product> getProducts() {
		return getProducts();
	}

	/**
	 * 
	 * @param word
	 */
    @Override
    @Transactional
	public Set<Product> getProductsByWord(String word) {
		return getProductsByWord(word);
	}

	/**
	 * 
	 * @param brand
	 */
    @Override
    @Transactional
	public Set<Product> getProductByBrand(String brand) {
		return getProductByBrand(brand);
	}

	/**
	 * 
	 * @param product
	 */
    @Override
    @Transactional
	public void addProduct(Product product) {
		addProduct(product);
	}

	/**
	 * 
	 * @param product
	 */
    @Override
    @Transactional
	public void updateProduct(Product product) {
		updateProduct(product);
	}

	/**
	 * 
	 * @param product
	 */
    @Override
    @Transactional
	public void deleteProduct(Product product) {
		deleteProduct(product);
	}

}