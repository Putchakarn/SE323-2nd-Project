package cbsd.lab11.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 12/2/12
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Customer {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "LName")
    @NotEmpty(message = "Please enter name")
    @Size(min=3,max=12,message = "Name must between 3 to 13 charecter")
    String name;
    @Column(name = "SName")
    @NotEmpty(message = "Please enter surname")
    String surname;

    @Column(name = "address")
    private String address;

    @Cascade({CascadeType.ALL})
    @OneToOne
    private Image image;




    public Customer(){

    }

    public Customer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;

        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (image != null ? !image.equals(customer.image) : customer.image != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (surname != null ? !surname.equals(customer.surname) : customer.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);

        return result;
    }
}
