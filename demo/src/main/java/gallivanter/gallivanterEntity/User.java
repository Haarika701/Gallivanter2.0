package gallivanter.gallivanterEntity;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    Long id;

    @Column(name = "first_name", nullable = false, length = 45)
    String firstString;

    @Column(name = "last_name", nullable = true, length = 45)
    String lastString;

    @Column(name = "email", nullable = false, length = 128)
    String email;

    @Column(name = "password", nullable = false, length = 64)
    String passwordString;

    @Column(name = "photo", nullable = true, length = 64)
    String photo;

}
