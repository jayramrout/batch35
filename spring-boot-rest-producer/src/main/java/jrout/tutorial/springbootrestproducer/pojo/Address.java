package jrout.tutorial.springbootrestproducer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String address1;
    private String city;
    private String state;
    private String country;
    private int zip;
}
