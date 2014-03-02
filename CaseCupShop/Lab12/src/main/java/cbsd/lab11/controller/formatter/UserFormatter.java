package cbsd.lab11.controller.formatter;


import cbsd.lab11.entity.User;
import cbsd.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/6/13
 * Time: 7:40 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserFormatter implements Formatter<User> {
    @Autowired
    UserService userService;

    @Override
    public User parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(User user, Locale locale) {
        return null;
    }


}
