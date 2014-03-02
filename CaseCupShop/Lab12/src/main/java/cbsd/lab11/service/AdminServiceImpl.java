package cbsd.lab11.service;

import cbsd.lab11.dao.AdminCDAO;
import cbsd.lab11.dao.AdminDAO;
import cbsd.lab11.entity.Admin;
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