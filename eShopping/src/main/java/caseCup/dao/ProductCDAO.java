package caseCup.dao;

import caseCup.entity.Product;

public interface ProductCDAO {

	/**
	 * 
	 * @param product
	 */
	void addProduct(Product product);

	/**
	 * 
	 * @param product
	 */
	void updateProduct(Product product);

	/**
	 * 
	 * @param product
	 */
	void deleteProduct(Product product);

}