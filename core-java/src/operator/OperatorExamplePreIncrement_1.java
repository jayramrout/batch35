package operator;

public class OperatorExamplePreIncrement_1 {
    public static void main(String[] args) {
        int age = 10;
        /*
        System.out.println("Age is "+ age);
        age++; // only going to increment +1
        System.out.println("Age after two year  "+ age);
        age++;
        System.out.println("Age after two year  "+ age);
        */

//        System.out.println("Age is "+ age++); // post increment --> print and increment
//        System.out.println("Age after two year  "+ age++);
//        System.out.println("Age after two year  "+ age);

        System.out.println("*************************");
        // age = 10
        System.out.println("Age is "+ ++age); // pre increment --> increment and print
        System.out.println("Age after two year  "+ age++);
        System.out.println("Age after two year  "+ age);

    }
}
