package caseCup.service;

import caseCup.entity.Admin;

public interface AdminService {

	Admin getAdmin();

	/**
	 * 
	 * @param admin
     *
	 */
	void updateAdmin(Admin admin);

}