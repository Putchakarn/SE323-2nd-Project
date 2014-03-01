package caseCup.service;

import caseCup.entity.Product;

import java.util.Set;

public interface ProductService {

	Set<Product> getProducts();

	/**
	 * 
	 * @param word
	 */
	Set<Product> getProductsByWord(String word);

	/**
	 * 
	 * @param brand
	 */
	Set<Product> getProductByBrand(String brand);

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