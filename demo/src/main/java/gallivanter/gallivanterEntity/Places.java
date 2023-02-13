package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "places")
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment the primary key
    @Column(name = "id", length = 11)
    Long id;

    @Column(name = "city", length = 45)
    String city;

    @Column(name = "state", length = 45)
    String state;

    @Column(name = "country", length = 45)
    String country;

    @Column(name = "image", length = 64)
    String image;
}
