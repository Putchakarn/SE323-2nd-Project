package caseCup.service;

import caseCup.dao.AdminCDAO;
import caseCup.dao.AdminDAO;
import caseCup.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
	private AdminDAO adminDAO;
    @Autowired
	private AdminCDAO adminCDAO;

    public AdminServiceImpl() {
    }

    @Override
    @Transactional
    public Admin getAdmin() {
		return getAdmin();
	}

	/**
	 * 
	 * @param admin
	 */
    @Override
    @Transactional
	public void updateAdmin(Admin admin) {
		updateAdmin(admin);
	}

}