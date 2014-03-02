package cbsd.lab11.dao;



import cbsd.lab11.entity.Category;

import java.util.List;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
public interface CategoryDAO {
    public List<Category> getCategories();
    public void addCetegory(Category category);
    public void removeCetegory(Long id);
    public Category findById(Long id);

}
