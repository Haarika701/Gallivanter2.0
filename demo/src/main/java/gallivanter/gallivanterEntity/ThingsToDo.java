package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "thingsToDo")
public class ThingsToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false)
    Long id;

    @Column(name = "description", length = 128, nullable = true)
    String description;

    @Column(name = "category", length = 64, nullable = false)
    String category;

    @Column(name = "rating", length = 45, nullable = true)
    String rating;

    @Column(name = "image", length = 45, nullable = false)
    String image;

    @Column(name = "name", length = 64, nullable = false)
    String name;

}
