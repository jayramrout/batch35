package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDriver {
    public static void main(String[] args) {
        // List<String> mouses = getMeAllMouse()
        List<Mouse> mouses = new ArrayList<>();
        mouses.add(new Mouse("Apple"));
        mouses.add(new Mouse("Logitech"));
        mouses.add(new Mouse("Hp"));
        mouses.add(new Mouse("Hp"));

        mouses.forEach(System.out::println);

        System.out.println(System.lineSeparator());
        System.out.println("========SET=======");
        Set<Mouse> mouseSet = new HashSet<>(mouses);
        mouseSet.forEach(System.out::println);

/*

        Mouse mouse_1 = new Mouse("Apple");
        Mouse mouse_2 = new Mouse("Apple");

        System.out.println(mouse_1 == mouse_2);
        System.out.println(mouse_1.equals(mouse_2));

        System.out.println(mouse_1.hashCode());
        System.out.println(mouse_2.hashCode());
        System.out.println(mouse_1.hashCode() == mouse_2.hashCode());

*/

    }
}
