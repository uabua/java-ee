package ge.btu.lecture09.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;

    @ToString.Exclude
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    List<Comment> comments = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    List<Category> categories = new ArrayList<>();


    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;
}
