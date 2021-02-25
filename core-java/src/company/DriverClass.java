package company;

import classexample.Person;
import com.jrout.tax.TaxCalculator;
import rmi.FetchNamesImpl;

import java.rmi.RemoteException;

public class DriverClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("peter");
        person.setAge(55);
        person.setSalary(40000);

        TaxCalculator tc = new TaxCalculator();
        tc.calculateTax(person.getSalary(), person.getAge());
        // JDK
        // jar -cvf destination.jar .
        // jar -xvf destination.jar
    }
}

abstract class Vehicle {

    public void tiers(){
        System.out.println("Four wheel");
    }

    public abstract void oilUsage();
}

class Car extends Vehicle{

    @Override
    public void oilUsage() {
        System.out.println("93: Premium");
    }
}