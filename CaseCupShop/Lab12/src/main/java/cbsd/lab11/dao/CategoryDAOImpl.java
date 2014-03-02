package cbsd.lab11.dao;


import cbsd.lab11.entity.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by XGxYeSiSaexX on 2/10/14.
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories() {
        List categories = sessionFactory.getCurrentSession().createQuery("from Category").list();
        return categories;
    }

    @Override
    public void addCetegory(Category category) {
        sessionFactory.getCurrentSession().saveOrUpdate(category);
    }

    @Override
    public void removeCetegory(Long id) {

    }

    @Override
    public Category findById(Long id) {
        return (Category) sessionFactory.getCurrentSession().get(Category.class,id);
    }
}
