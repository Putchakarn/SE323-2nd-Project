package caseCup.util;


import caseCup.dao.UserDAO;
import caseCup.entity.*;
import caseCup.service.CartService;
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

    @Autowired
    CartService cartService;

    @Autowired
    UserDAO userDAO;
    boolean isLoad = false;
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
        if (!isLoad){
//            Lecturer a = new Lecturer("Chartchai",100);
//            Lecturer b = new Lecturer("Jayakrit",15015);
//            Student s1 = new Student("Adam",4000,"55123321","0868074518",3.81);
//            Student s2 = new Student("Billy",2500,"54123321","0812223354",2.00);
//            Student s3 = new Student("Charles",1200,"53122221","0864578521",1.85);
//            Student s4 = new Student("Damian",2300,"55111223","0812543215",2.25);
//            Student s5 = new Student("Effie",800,"55778899","053941100",1.74);
//            Student s6 = new Student("Federic",1200,"54112325","053498221",2.66);
//            Set<Student> c1 = new HashSet<Student>();
//            c1.add(s1);
//            c1.add(s3);
//            c1.add(s5);
//            c1.add(s6);
//            courseService.addCourse(new Course("Component based software development", "953331", a, c1));
//            Set<Student> c2 = new HashSet<Student>();
//            c2.add(s1);
//            c2.add(s2);
//            c2.add(s4);
//            courseService.addCourse(new Course("Introduction to HCI", "953421", b, c2));

            Admin a = new Admin("Putchakarn","Jaukon","CAMT Chiang mai");
            Customer c = new Customer("Catnip","Averdine","13 sector Hunger game");
            Customer b = new Customer("Deen","Longy","Aubon Thailand");
            Set<Customer> customers = new HashSet<Customer>();
            customers.add(c);
            customers.add(b);

            Product p1 = new Product("Love","Apple",300,"Love soft case");
            Product p2 = new Product("Lucky","Samsung",300,"Lucky soft case");
            Product p3 = new Product("Healthy","Apple",300,"Healthy soft case");
            Product p4 = new Product("Sport","Samsung",300,"Sport soft case");
            Product p5 = new Product("Dark","Apple",300,"Dark soft case");

            List<Product> products1 = new ArrayList<Product>();
            products1.add(p1);
            products1.add(p2);

            List<Product> products2 = new ArrayList<Product>();
            products2.add(p3);
            products2.add(p4);
            products2.add(p5);




            Cart cart1 = new Cart(products1,c,Calendar.getInstance().getTime(),true);
            Cart cart2 = new Cart(products2,b,Calendar.getInstance().getTime(),true);



            cartService.addCart(cart1);
            cartService.addCart(cart2);



            // add the login data
            User user = new User();
            user.setName("admin");
            // Actual password: admin
            user.setPassword("21232f297a57a5a743894a0e4a801fc3");
            // Admin user
            user.setRole(1);
            userDAO.saveUser(user);


            user = new User();
            user.setName(c.getName());
            // Actual password: user
            user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
            // Regular user
            user.setRole(2);
            userDAO.saveUser(user);


            user = new User();
            user.setName(b.getName());
            // Actual password: user
            user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
            // Regular user
            user.setRole(2);
            userDAO.saveUser(user);

            isLoad = true;
        }
    }
}
