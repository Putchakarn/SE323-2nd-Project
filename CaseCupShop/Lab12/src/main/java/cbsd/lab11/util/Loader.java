package cbsd.lab11.util;

import cbsd.lab11.dao.UserDAO;
import cbsd.lab11.entity.*;
import cbsd.lab11.service.CartService;
import cbsd.lab11.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 1/26/13
 * Time: 7:51 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Loader implements ApplicationListener<ContextRefreshedEvent> {

//    @Autowired
//    CartService cartService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    UserDAO userDAO;

    boolean isLoad = false;
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
        if (!isLoad){
            Admin a = new Admin("Chartchai","Lucky","Chiangmai TH");
            Admin b = new Admin("Jayakrit","Lucky","Lamphin TH");
            Customer c = new Customer("Catnip","Averdine","13 sector Hunger game");
            Customer d = new Customer("Deen","Longy","Aubon Thailand");
            Set<Customer> customers = new HashSet<Customer>();
            customers.add(c);
            customers.add(d);


            Product p1 = new Product("Love",400,"Love soft case");
            Product p2 = new Product("Lucky",300,"Lucky soft case");
            Product p3 = new Product("Healthy",300,"Healthy soft case");
            Product p4 = new Product("Sport",300,"Sport soft case");
            Product p5 = new Product("Dark",300,"Dark soft case");

            List<Product> products1 = new ArrayList<Product>();
            products1.add(p1);
            products1.add(p2);

            List<Product> products2 = new ArrayList<Product>();
            products2.add(p3);
            products2.add(p4);
            products2.add(p5);

           categoryService.addCategory(new Category("Apple",products1));
           categoryService.addCategory(new Category("Samsung",products2));


//           cartService.addCart(new Cart(products1,c,Calendar.getInstance().getTime(),700.00,true));
//           cartService.addCart(new Cart(products2,d,Calendar.getInstance().getTime(),900.00,true));


            // add the login data
            User user = new User();
            user.setUsername("admin");
            user.setName("Catnip");
            // Actual password: admin
            user.setPassword("21232f297a57a5a743894a0e4a801fc3");
            // Admin user
            user.setRole(1);
            userDAO.saveUser(user);
            user = new User();
            user.setUsername("user");
            user.setName("Deen");
            // Actual password: user
            user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
            // Regular user
            user.setRole(2);
            userDAO.saveUser(user);
            isLoad = true;
        }
    }
}
