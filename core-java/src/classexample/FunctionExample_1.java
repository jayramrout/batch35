package classexample;

public class FunctionExample_1 {
    String testing;

    public void formula(int a , int b) {
        if(a>b && a > 15 && b > 16) {
            System.out.println(" OK " + a + " Is allowed to make friends with "+ b);
        }
    }

    public void add(int a , int b) {
        System.out.println(a+b);
    }

    // Overloading
    public void add(int a , int b, int c) {
        System.out.println(a+b);
    }

    public int addReturn(int a , int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        int c = 50;
        int d = 40;

        int cc = 70;
        int dd = 60;

        FunctionExample_1 fe = new FunctionExample_1();

//        new FunctionExample_1().formula();

        System.out.println(fe.testing);
        fe.formula(a,b);
        fe.formula(c,d);
        fe.formula(cc,dd);

        System.out.println(System.lineSeparator());

        fe.add(a,b); // 50
        fe.add(c,d); // 90
        fe.add(cc,dd); // 130
        fe.add(a,b,c);
//        fe.addReturn(a,b);

        int returnVal1 = fe.addReturn(a,b);
        int returnVal2 = fe.addReturn(c,d);
        int returnVal3 = fe.addReturn(cc,dd);
        int finalValue = returnVal1 + returnVal2 + returnVal3;

        System.out.println(" finalValue "+finalValue);

    }


}

