package basics;

import java.util.Scanner;

public class JShell {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int aa = scanner.nextInt();

        System.out.println("Please enter Second number");
        int bb = scanner.nextInt();

//        String a = "20"; // hardcode and dynamic
//        String b = "30";

//        int aa = Integer.parseInt(a);
//        int bb = Integer.parseInt(b);
        System.out.println("The final answer is :");
        System.out.println(aa + bb); // concatination
    }
}
