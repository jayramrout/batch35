package classexample;

public class DriverClass_ReferenceVariable {
    /*
    main method/function
    method it has a signature ()
     */
    public static void main(String[] args) {

        Person remote1 = new Person();
        remote1.name = "Peter";
        Person remote2 = remote1;

        System.out.println(remote1.name);
        System.out.println(remote2.name); // java.lang.NullPointerException

        remote2.name = "Daren";

        System.out.println(remote1.name);
        System.out.println(remote2.name);

    }
}
