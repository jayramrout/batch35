package classexample;

public class FunctionExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        int c = 50;
        int d = 40;

        int cc = 70;
        int dd = 60;

        //
        System.out.println(a+b);
        System.out.println(c+d);

        // if a > b and if a > 15 and b > 16
        if(a>b && a > 15 && b > 16) {
            System.out.println(" OK " + a + " Is allowed to make friends with "+ b);
        }

        // if c > d and if c > 15 and d > 16
        if(c > d && c > 15 && d > 16) {
            System.out.println(" OK " + c + " Is allowed to make friends with "+ d);
        }


        if(cc > dd && cc > 15 && dd > 16) {
            System.out.println(" OK " + cc + " Is allowed to make friends with "+ dd);
        }

    }




}

