package caseCup.controller.formatter;


import caseCup.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import caseCup.service.CartService;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/6/13
 * Time: 9:09 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class CartFormatter  implements Formatter<Cart> {
    @Autowired
    CartService cartService;

    @Override
    public Cart parse(String s, Locale locale) throws ParseException {
        return cartService.getCartById(s);
    }

    @Override
    public String print(Cart cart, Locale locale) {
        return null;
    }

//    @Override
//    public String print(Cart cart, Locale locale) {
//        return cart.get
//    }
}