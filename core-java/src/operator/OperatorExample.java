package operator;

public class OperatorExample {
    public static void main(String[] args) {
        // byte short int long float double
        int modulesValue = 10 % 4; // modules is reminder
        System.out.println(modulesValue);

        /*int age = 10;
        System.out.println("Age is "+ age);
//        age = age + 1;
        int newAge = age + 1;
        System.out.println("after one year Age is "+ newAge);

        newAge = newAge + 1;
        System.out.println("age after one year Age is "+ newAge);

        System.out.println("Initial Age was "+ age);*/


        int age = 10;
        System.out.println("Age is "+ age);
//        age = age+1;
        age++;
        System.out.println("Age after one year  "+ age);

        age++;
        System.out.println("Age after one year  "+ age);
    }
}
