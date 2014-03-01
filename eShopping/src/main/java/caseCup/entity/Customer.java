package caseCup.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @Column(name = "ID") //*****************  not sure ********//
    @GeneratedValue
	private String customerID;
	private String name;
	private String surname;
	private String address;
	private String username;
	private String password;

    @Cascade({CascadeType.SAVE_UPDATE})
    @OneToMany(mappedBy = "customer" , fetch = FetchType.EAGER)
    private List<Cart> carts;

    @Cascade({CascadeType.ALL})
    @OneToOne
	private Image image;


    public Customer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        if (customerID != null ? !customerID.equals(customer.customerID) : customer.customerID != null) return false;
        if (image != null ? !image.equals(customer.image) : customer.image != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (password != null ? !password.equals(customer.password) : customer.password != null) return false;
        if (surname != null ? !surname.equals(customer.surname) : customer.surname != null) return false;
        if (username != null ? !username.equals(customer.username) : customer.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerID != null ? customerID.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}