package cbsd.lab11.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/3/13
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User implements Serializable{

    @Id
    @GeneratedValue
    Long id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotEmpty(message = "Please insert username")
    @Size(min=4,max=16,message = "Username must between 4 to 16 charecter")
    private String username;

    @NotEmpty(message = "Please insert name")
    private String name;

    @NotEmpty(message = "Please insert password")
    String password;



    String address;

    int role;

    @Cascade({CascadeType.ALL})
    @OneToOne
    Image image;

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {  return address; }

    public void setAddress(String address) {  this.address = address;  }
}
