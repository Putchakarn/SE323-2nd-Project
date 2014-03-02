package cbsd.lab11.service;

import cbsd.lab11.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/10/13
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User findByName(String name);
    User findById(Integer id);
    User findByUsername(String username);
    public void addUser(User user);
    public List<User> getAllUser();

}
