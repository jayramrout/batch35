package exception;

import java.util.Scanner;

public class Exception_5 {
    public static void main(String[] args) {
        int priceMoney[] = {2,3,4,5,66,7,8,9,90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and "+ (priceMoney.length-1));
        int input = scanner.nextInt();
        System.out.println("Enter you favorite number also");
        int favNumber = scanner.nextInt();

        int money = 0;
        try{
            money = priceMoney[input];
            money = money/favNumber;
            //...................
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException  exception) {
            money = 1;
            exception.printStackTrace();
        }catch (Exception exception) {
            money = 3;
            exception.printStackTrace();
        }finally {
            System.out.println("This is my finally block...");
        }

//        calculateTheMiles(money);

        // caller
        try {
            calculateTheMiles(money);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Congratulations you have won $"+ money);
        System.out.println("I am done with the program");
    }


    public static void calculateTheMiles(int x) throws Exception { // > 4
        String miles = null;
        String milesArray[] = {"10 Miles","3 Miles","4 Miles","25 Miles"};

        miles = milesArray[x];

        System.out.println("Congratulation you have won "+ miles.toUpperCase());

    }
}
