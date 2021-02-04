package classexample;

public class DriverClass_NullReference {
    /*
    main method/function
    method it has a signature ()
     */
    public static void main(String[] args) {
        //new TV();
        // remote
        // remote = new TV();
        Person p1 = null;

        System.out.println(p1.name); // java.lang.NullPointerException
        System.out.println("Hello We r in class..");



    }
}
