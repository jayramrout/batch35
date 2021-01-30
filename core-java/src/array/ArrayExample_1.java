package array;

public class ArrayExample_1 {
    public static void main(String[] args) {
//        int a = 10; // we cannot use any special starting character for variables
        int age1 = 10;
//        int age2 = 20;
        int age3 = 30;
        int age4 = 40;
        // array as bag
        int ages[]  =  new int[5];
//        float marks[]  =  new float[5];
        ages[0] = age1;
        ages[1] = 20;
        ages[2] = age3;
        ages[3] = age4;

        System.out.println("Length of the array is : "+ages.length);

        System.out.println("First element "+ ages[0]);
        System.out.println("2nd element "+ ages[1]);
        System.out.println("3rd element "+ ages[2]);
        System.out.println("4th element "+ ages[3]);
        System.out.println("5th element "+ ages[4]);
    }
}
