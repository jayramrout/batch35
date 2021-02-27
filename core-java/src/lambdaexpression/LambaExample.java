package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambaExample {
    public static void main(String[] args) {
        IEat eat = new Dog();
        eat.eat();

        IEat eat1 = new Human();
        eat1.eat();

        /*IEat parrot = new IEat() {
            @Override
            public void eat() {
                System.out.println("Parrot eat with their legs...");
            }
        };*/

        IEat parrot = () -> System.out.println("Parrot eat with their legs...");
        parrot.eat();

        int a = 10;

    }




}


@FunctionalInterface
interface IEat {
    void eat();
//    void drink();
}

class Human implements IEat{

    @Override
    public void eat() {
        System.out.println("We humans eat with Hand");
    }
}


class Dog implements IEat{
    @Override
    public void eat() {
        System.out.println("We Dogs Use Mouth");
    }
}



