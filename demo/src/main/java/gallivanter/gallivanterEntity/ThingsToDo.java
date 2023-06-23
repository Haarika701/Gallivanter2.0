package gallivanter.gallivanterEntity;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "THINGSTODO")

public class ThingsToDo {
    private static final GenerationType SEQUENCE = null;
    private Long id;
    private String description;
    private String category;
    private String rating;
    private String image;
    private String name;

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ")
    @Column(name = "ID", length = 11, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DESCRIPTION", length = 128, nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "CATEGORY", length = 64, nullable = false)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "RATING", length = 45, nullable = true)
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Column(name = "IMAGE", length = 45, nullable = false)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "NAME", length = 64, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
