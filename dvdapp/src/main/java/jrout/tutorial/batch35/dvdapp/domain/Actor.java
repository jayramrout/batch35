package jrout.tutorial.batch35.dvdapp.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name="actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="actor_id")
    private int actorId; // actor_id --> actorId

    @Column(name="first_name")
    private String firstName; // first_name --> firstName
    @Column(name="last_name")
    private String lastName;
    @Column(name = "last_update")
    private Date lastUpdated;

//    private String actorTag;
}
