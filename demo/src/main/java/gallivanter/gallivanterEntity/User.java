package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    private static final GenerationType SEQUENCE = null;
    private Long id;
    private String firstString;
    private String lastString;
    private String emailString;
    private String passString;
    private String imageUString;

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "CUST_SEQ")
    @Column(name = "USER_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME", nullable = false, length = 45)
    public String getfirstString() {
        return firstString;
    }

    public void setfirstString(String firstString) {
        this.firstString = firstString;
    }

    @Column(name = "LAST_NAME", nullable = true, length = 45)
    public String getLastString() {
        return lastString;
    }

    public void setLastString(String lastString) {
        this.lastString = lastString;
    }

    @Column(name = "EMAIL", nullable = false, length = 128)
    public String getEmailString() {
        return emailString;
    }

    public void setEmaString(String emailString) {
        this.emailString = emailString;
    }

    @Column(name = "PHOTO_URL", nullable = true, length = 64)
    public String getImageUString() {
        return imageUString;
    }

    public void setImageUString(String imageUString) {
        this.imageUString = imageUString;
    }

    @Column(name = "PASSWORD", nullable = false, length = 8)
    public String getPasswordString() {
        return passString;
    }

    public void setPasswordString(String passwordString) {
        this.passString = passwordString;
    }

}
