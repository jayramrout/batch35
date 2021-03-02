package lambdaexpression;

import inheritance.Person;
import jdk.jfr.Percentage;

public class LambaExpressionExample {
    public static void main(String[] args) {
        IAddition addition = new Addition();
        addition.add(2,3);

        IAddition additionInd = new IndianAddition();
        additionInd.add(2,3);

        IAddition frenchAddition = new IAddition() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b+1);
            }
        };

        frenchAddition.add(2,3);

        Person per = new Person(){
            @Override
            public void swim() {
                System.out.println("I can swim in water and sea...");
            }
        };
        per.swim();

        IAddition chinesAddition = (a,b) -> System.out.println(a+b+100);
        chinesAddition.add(2,3);

    }
}

@FunctionalInterface
interface IAddition {
    void add(int a , int b);
}

class Addition implements IAddition {

    @Override
    public void add(int a, int b) {
        System.out.println((a+b));
    }
}

class IndianAddition implements IAddition {

    @Override
    public void add(int a, int b) {
        System.out.println(((a+b)+3));
    }
}


