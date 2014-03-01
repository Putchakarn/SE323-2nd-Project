package caseCup.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @Column(name = "ID") //*****************  not sure ********//
    @GeneratedValue
	private String productID;
	private String name;
	private String brand;
	private double price;
	private String description;


    @ManyToOne(fetch = FetchType.EAGER)  //*****************  not sure ********//
    private Cart cart;

    @Cascade({CascadeType.ALL})
    @OneToOne
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getProductID() {
		return this.productID;
	}

	/**
	 * 
	 * @param productID
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}