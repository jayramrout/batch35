package array;

public class ArrayExample_2 {
    public static void main(String[] args) {
//        char chars[] = new char[20];
//        String students[] = new String[20];

        // multi line comment : ctrl + shift + /
        /*
        int ages[]  =  new int[5];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        ages[4] = 50;
        */

        int ages[] = {10,20,30,40,50}; // creation and initialization at the same time.
//        int ages[] = new int []{10,20,30,40,50};
//        ages[5] = 60; // error ArrayIndexOutOfBoundsException
//
        // ArrayIndexOutOfBoundsException : RuntimeException
        // CompileTime
        System.out.println("6th element "+ ages[5]);
    }
}
