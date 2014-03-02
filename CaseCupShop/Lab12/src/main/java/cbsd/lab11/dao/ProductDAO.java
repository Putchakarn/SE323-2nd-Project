package cbsd.lab11.dao;



import cbsd.lab11.entity.Product;

import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
public interface ProductDAO {
    public Set<Product> getProducts();
    public Product getProductById(Long id);
    public void addProduct(Product product);
    public void removeProduct(Long id);
    public Product findById(Long id);

}
