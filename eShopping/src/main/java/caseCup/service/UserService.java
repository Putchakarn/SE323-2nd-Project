package caseCup.service;


import caseCup.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/10/13
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User findByName(String name);
}
