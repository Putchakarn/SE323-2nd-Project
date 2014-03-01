package caseCup.controller;

import caseCup.entity.Product;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import caseCup.service.ProductService;

public class ProductController {

	private ProductService productService;

	/**
	 * 
	 * @param product
	 * @param bindingResult
	 * @param model
	 */
	public String addProduct(Product product, BindingResult bindingResult, Model model) {
		// TODO - implement ProductController.addProduct
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param product
	 * @param model
	 */
	public String updateProduct(Product product, Model model) {
		// TODO - implement ProductController.updateProduct
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param product
	 * @param model
	 */
	public String deleteProduct(Product product, Model model) {
		// TODO - implement ProductController.deleteProduct
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param word
	 * @param model
	 */
	public String searchProduct(String word, Model model) {
		// TODO - implement ProductController.searchProduct
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param brand
	 * @param model
	 */
	public String productCatalog(String brand, Model model) {
		// TODO - implement ProductController.productCatalog
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param model
	 */
	public String productList(Model model) {
		// TODO - implement ProductController.productList
		throw new UnsupportedOperationException();
	}

}