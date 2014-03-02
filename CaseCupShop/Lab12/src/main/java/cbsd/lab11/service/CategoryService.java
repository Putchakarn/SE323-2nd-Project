package cbsd.lab11.service;



import cbsd.lab11.entity.Category;

import java.util.List;
import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
public interface CategoryService {
    public List<Category> getCategories();
    public void addCategory(Category category);
    public void removeCetegory(Long id);
    public Category findById(Long id);
}
