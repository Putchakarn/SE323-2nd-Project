package cbsd.lab11.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 12/2/12
 * Time: 8:27 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue
    Long id;
    String name;

    @ManyToMany (fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE})
    List<Product> products = new ArrayList<Product>();

    public Category(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public List<Product> getProducts() {

        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }





    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
}
