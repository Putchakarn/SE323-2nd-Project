package cbsd.lab11.service;


import cbsd.lab11.entity.Admin;

public interface AdminService {

	Admin getAdmin();

	/**
	 * 
	 * @param admin
     *
	 */
	void updateAdmin(Admin admin);

}