package classexample;

import exception.Exception_6_UserDefinedException;
import exception.HelloDivideByZeroException;

public class DriverClass {
    /*
    main method/function
    method it has a signature ()
     */
    public static void main(String[] args) {
        // remote = new TV();

        Person person1 = new Person(); // person1 is a reference to new Person();
        person1.name = "Peter";
        person1.height = 5;
        person1.address = "Lex Street";

        Person p1 = new Person();
        new Person();
        new Person();

        Person person2 = new Person();
//        person2.name = "Dan";
//        person2.height = 4;
//        person2.address = "Kala Street";

        // null means its not pointing to anything..



        System.out.println(person1.name + " "+ person1.height +" "+ person1.address);
        System.out.println(person2.name + " "+ person2.height +" "+ person2.address);

//        System.out.println(person2);
        try{
            Exception_6_UserDefinedException.divide(5,0);
        }catch (Exception hbze){

        }
    }
}
