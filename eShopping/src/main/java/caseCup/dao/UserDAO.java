package caseCup.dao;


import caseCup.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/10/13
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDAO {
    User findByName(String name);
    void saveUser(User user);
}
