package mariami.chakhvadze.bookstore.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<Tag> tags = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    List<Author> authors = new ArrayList<>();
}
