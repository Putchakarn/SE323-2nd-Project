package caseCup.dao;

import caseCup.entity.Admin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl implements AdminDAO, AdminCDAO {

    @Autowired
	private SessionFactory sessionFactory;


    public AdminDAOImpl() {


    }

    @Override
    public Admin getAdmin() {

        return (Admin)sessionFactory.getCurrentSession().createQuery("from Admin").uniqueResult();

    }

    @Override
	public void updateAdmin(Admin admin) {
        sessionFactory.getCurrentSession().saveOrUpdate(admin);
	}

}