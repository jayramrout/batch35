package exception;

// java Exception_1
//    new Exception_1().main()
// try-catch
// try-catch-finally
// try-finally
// nested try catch
// Runtime exception
// compile time error
import java.util.Scanner;
import java.lang.System;
public class Exception_1 {
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
        }catch (ArrayIndexOutOfBoundsException exception) {
            money = 1;
        }catch (ArithmeticException exception){
            money = 2;
        }finally {
            System.out.println("This is my finally block...");
        }

        System.out.println("Congratulations you have won $"+ money);

        System.out.println("I am done with the program");
    }

}
