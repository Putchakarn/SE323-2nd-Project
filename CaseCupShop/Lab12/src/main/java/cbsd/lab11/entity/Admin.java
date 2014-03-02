package cbsd.lab11.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 12/2/12
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Admin")
public class Admin {
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
    Image image;

    public Admin() {
    }

    public Admin(String name, String surname, String address) {
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

        Admin admin = (Admin) o;

        if (address != null ? !address.equals(admin.address) : admin.address != null) return false;
        if (id != null ? !id.equals(admin.id) : admin.id != null) return false;
        if (image != null ? !image.equals(admin.image) : admin.image != null) return false;
        if (name != null ? !name.equals(admin.name) : admin.name != null) return false;
        if (surname != null ? !surname.equals(admin.surname) : admin.surname != null) return false;

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