package collection;

import inheritance.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListExample_3_Consumer {
    public static void main(String[] args) {
        // read a file and pull the names inside the file...
        //String names[] = new String[100];

        List<String> names = new ArrayList<>();
        // this is growable.
        names.add("ONE");
        names.add("THREE");
        names.add("FOUR");
        names.add("FOUR"); // this keeps duplicates...

        names.add(1,"TWO");
        System.out.println(names);
        names.forEach(new PrintName());

        //anonynimous inner class...
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello "+ s);
            }
        });

        names.forEach(s -> System.out.println("Hello "+ s));
        names.forEach(System.out::println);

    }


    // Inner class
    static class PrintName implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println("Hello "+ s);
        }
    }


}
