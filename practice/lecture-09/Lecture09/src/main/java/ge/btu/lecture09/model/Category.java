package ge.btu.lecture09.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ToString.Exclude
    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    List<Post> posts = new ArrayList<>();
}
