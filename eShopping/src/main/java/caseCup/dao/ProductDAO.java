package caseCup.dao;

import caseCup.entity.Product;

import java.util.List;
import java.util.Set;

public interface ProductDAO {

	Set<Product> getProducts();

	/**
	 * 
	 * @param word
	 */
	List<Product> getProductsByWord(String word);

	/**
	 * 
	 * @param brand
	 */
	List<Product> getProductsByBrand(String brand);

}