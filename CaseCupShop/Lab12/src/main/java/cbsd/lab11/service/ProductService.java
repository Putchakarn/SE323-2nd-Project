package cbsd.lab11.service;



import cbsd.lab11.entity.Category;
import cbsd.lab11.entity.Product;

import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
public interface ProductService {
    public void addProduct(Product product);
    public void removeProduct(Long id);
    public Product findById(Long id);
    public Set<Product> getProducts();
    public Set<Product> getProductByCategory(Category category);
    public Product getProductById(Long id);

}
