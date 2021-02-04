package classexample;

public class DriverClass_Complex {
    /*
    main method/function
    method it has a signature ()
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Peter";
        // i m not initializing the address..so we will get as null

        Job job = new Job();
        job.name = "Computers";
        job.shift = "Morning";
        job.salary = 40000;

        System.out.println(person.name);
        System.out.println("person.address = " + person.address);
        System.out.println("person.job = " + person.job);

        person.job = job;
        System.out.println("person.job.name = " + person.job.name);

    }
}
