package jrout.tutorial.batch35.dvdapp.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity

@NamedQuery(name="Actor.findAllEmpoyee", query = "select e from Actor e")
@NamedNativeQuery(name = "Actor.findByLastName", query = "SELECT * FROM Actor WHERE last_name = ?1", resultClass = Actor.class)
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int actorId;

    private String firstName;
    private String lastName;
    @Column(name = "last_update")
    private Date lastUpdated;

    @Transient
    private String actorTag;
}
