package collection;

import java.util.*;

public class CollectionExample_3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ONE");
        names.add("TWO");
        names.add("AHREE");
        names.add("TRESA");
        names.add("TRuDO");
        names.add("FOUR");
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

    }
}
