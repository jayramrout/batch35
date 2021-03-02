package collection;

import inheritance.Person;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // read a file and pull the names inside the file...
        //String names[] = new String[100];

        List<String> names = new ArrayList<>();
        // this is growable.
        names.add("ONE");
        names.add("TWO");
        names.add("THREE");
        names.add("FOUR");
        names.add("FOUR"); // this keeps duplicates...
//        names.add(new Person());
        System.out.println(names);
        System.out.println(names.size());

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // []
        }

        for(String name : names){
            System.out.println(name);
        }
        // Scanner/ BufferedReader to read the file and read each line...
        // names.add();
    }
}
