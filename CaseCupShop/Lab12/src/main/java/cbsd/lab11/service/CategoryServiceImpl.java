package cbsd.lab11.service;


import cbsd.lab11.dao.CategoryDAO;
import cbsd.lab11.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;


    @Override
    @Transactional
    public List<Category> getCategories() {
        return categoryDAO.getCategories();
    }

    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryDAO.addCetegory(category);
    }

    @Override
    @Transactional
    public void removeCetegory(Long id) {

    }

    @Override
    @Transactional
    public Category findById(Long id) {
        return categoryDAO.findById(id);
    }
}
