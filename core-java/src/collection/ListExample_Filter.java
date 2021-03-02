package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListExample_Filter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ONE");
        names.add("TWO");
        names.add("THREE");
        names.add("TRESA");
        names.add("TRuDO");
        names.add("FOUR");
        names.add("FOUR");

        /*List<String> nameStarWithT = new ArrayList<>();
        for(String name : names){
            if(name.startsWith("T")){
                nameStarWithT.add(name);
            }
        }

        System.out.println("Names start with T" );
        nameStarWithT.forEach(System.out::println);
*/

        /*List<String> newNamesWIthT = names.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("T");
                    }
                })
                .collect(Collectors.toList());*/

        List<String> newNamesWIthT = names.stream()
                .filter(s -> s.startsWith("T"))
                .filter(s -> s.endsWith("O"))
                .collect(Collectors.toList());

        newNamesWIthT.forEach(System.out::println);
    }
}
