package caseCup.entity;



import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity
public class Cart {

    @Id
    @Column(name = "ID") //*****************  not sure ********//
    @GeneratedValue
    private String cartID;

    @Cascade({CascadeType.SAVE_UPDATE})
    @OneToMany(fetch = FetchType.EAGER , mappedBy = "cart")  //*****************  not sure ********//
	private List<Product> products;

    @ManyToOne
	private Customer customer;

	private Date date;
	private Double totalPrice;
	private boolean status;


    public Cart(List<Product> products, Customer customer, Date date,Double totalPrice, boolean status) {
        this.products = products;
        this.customer = customer;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (status != cart.status) return false;
        if (cartID != null ? !cartID.equals(cart.cartID) : cart.cartID != null) return false;
        if (customer != null ? !customer.equals(cart.customer) : cart.customer != null) return false;
        if (date != null ? !date.equals(cart.date) : cart.date != null) return false;
        if (products != null ? !products.equals(cart.products) : cart.products != null) return false;
        if (totalPrice != null ? !totalPrice.equals(cart.totalPrice) : cart.totalPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartID != null ? cartID.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}