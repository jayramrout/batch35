package classexample;

import java.io.Serializable;

/**
 * Person is a real world entity
 * POJO : Plain Old Java Object
 * Domain Object
 *
 */
public class Person implements Serializable {
    String name; // instance variables
    int height; //premitive vs wrapper
    String address;
    Address address1;
    transient String ssn;
    public static String classVariable;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

//    String jobName; // properties , instance variables...
//    String jobShift;
//    float jobSalary;

    Job job;

//    public Person(){
//
//    }

    public void eat(){

    }
}
