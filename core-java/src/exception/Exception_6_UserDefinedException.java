package exception;

import java.util.Scanner;

public class Exception_6_UserDefinedException {
    public static void main(String[] args) {
        try {
            divide(5,0);
        } catch (HelloDivideByZeroException e) {
            e.printStackTrace();
        }
    }

   public static void divide(int i , int j) throws HelloDivideByZeroException {
        if(j == 0) {
            throw new HelloDivideByZeroException("You have passed ZERO Value");
        }
   }

   /*
    mad person throws a stone...
    walk walk...close...it will throw stone on you...
    */
}

