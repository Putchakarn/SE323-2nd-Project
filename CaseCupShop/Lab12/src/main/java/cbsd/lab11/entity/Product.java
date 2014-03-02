package cbsd.lab11.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 12/2/12
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;



    @Column(name = "PName")
    @NotEmpty(message = "Please enter name")
    @Size(min=3,max=12,message = "Name must between 3 to 13 charecter")
    String name;

    @NumberFormat(style = NumberFormat.Style.NUMBER)
    double price;

    @NotEmpty(message = "Please enter description")
    String description;

    @Cascade({CascadeType.ALL})
    @OneToOne
    Image image;




    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = price != +0.0d ? Double.doubleToLongBits(price) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Product(String name, double salary) {

        this.name = name;
        this.price = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    public Product() {

    }

    public Product(String name, double price, String description, Image image) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
