package operator;

public class OperatorExampleIncrement_1 {
    public static void main(String[] args) {
         int mult = 3;
        mult *=  5; // mult = mult * 5;

        int age = 10;
        System.out.println("Age is "+ age);
//        age = age+2;
        age += 2;
//        age++; // only going to increment +1
        System.out.println("Age after two year  "+ age);
        age = age+2;
//        age++;
        System.out.println("Age after two year  "+ age);
    }
}
