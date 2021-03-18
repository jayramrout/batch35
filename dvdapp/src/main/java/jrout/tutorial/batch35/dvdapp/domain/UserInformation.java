package jrout.tutorial.batch35.dvdapp.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserInformation {
    private String email;
    private String password;
    private String remember;
}
