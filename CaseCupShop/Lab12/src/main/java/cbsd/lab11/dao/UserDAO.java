package cbsd.lab11.dao;

import cbsd.lab11.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/10/13
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDAO {
    User findByName(String name);
    public User findById(Integer id);
    User findByUsername(String username);
    void saveUser(User user);
    List<User> getAllUser();

}
