package jrout.tutorial.batch35.dvdapp.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Actor {
    private int actorId; // actor_id --> actorId
    private String firstName; // first_name --> firstName
    private String lastName;
    private Date lastUpdated;
    private String actorTag;
}
