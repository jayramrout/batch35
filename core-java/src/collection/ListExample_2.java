package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample_2 {
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
/*

        for(String name : names){
//            System.out.println("Hello "+ name);
            printName(name);
        }
*/

        names.forEach(ListExample_2::printName);
    }

    public static void printName(String name){
        System.out.println("Hello "+ name);
    }


}
