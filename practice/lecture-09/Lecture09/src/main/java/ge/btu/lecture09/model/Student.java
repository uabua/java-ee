package ge.btu.lecture09.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String username;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private int age;
}
