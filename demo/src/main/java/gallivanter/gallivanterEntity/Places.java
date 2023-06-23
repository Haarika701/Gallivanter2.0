package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "PLACES")
public class Places {

    private Long id;
    private String city;
    private String state;
    private String country;
    private String image;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment the primary key
    @Column(name = "ID", length = 11)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CITY", length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "STATE", length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "COUNTRY", length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "IMAGE", length = 64)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
