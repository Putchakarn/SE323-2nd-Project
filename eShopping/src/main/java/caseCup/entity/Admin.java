package caseCup.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
public class Admin {

    @Id
    @Column(name = "ID") //*****************  not sure ********//
    @GeneratedValue
	private String adminID;

	private String name;
	private String surname;
	private String address;


	private String username;
	private String password;

    @Cascade({CascadeType.ALL})
    @OneToOne
	private Image image;

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (address != null ? !address.equals(admin.address) : admin.address != null) return false;
        if (adminID != null ? !adminID.equals(admin.adminID) : admin.adminID != null) return false;
        if (image != null ? !image.equals(admin.image) : admin.image != null) return false;
        if (name != null ? !name.equals(admin.name) : admin.name != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        if (surname != null ? !surname.equals(admin.surname) : admin.surname != null) return false;
        if (username != null ? !username.equals(admin.username) : admin.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminID != null ? adminID.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}