package jrout.tutorial.batch35.dvdapp.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity

@NamedQuery(name="Actor.findAllActor", query = "select a from Actor a")
@NamedNativeQuery(name = "Actor.findByLastName", query = "SELECT * FROM Actor WHERE last_name = ?1", resultClass = Actor.class)
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorId;

    private String firstName;
    private String lastName;
    @Column(name = "last_update")

    @UpdateTimestamp
    private Date lastUpdated;

    @Transient
    private String actorTag;
}
