package collection;

import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Mouse> mouses = new ArrayList<>();
        mouses.add(new Mouse("Logitech","Blue"));
        mouses.add(new Mouse("Logitech 1","Xlue"));
        mouses.add(new Mouse("Hp","Black"));
        mouses.add(new Mouse("Hp","Purple"));
        mouses.add(new Mouse("Apple","While"));


        System.out.println(mouses);

        /*Collections.sort(mouses, new Comparator<Mouse>() {
            @Override
            public int compare(Mouse o1, Mouse o2) {
                return o1.getCompany().compareTo(o2.getCompany());
            }
        });

        Collections.sort(mouses, (o1, o2) -> o1.getCompany().compareTo(o2.getCompany()));*/
        Collections.sort(mouses, Comparator.comparing(Mouse::getColor).reversed());

        System.out.println(mouses);
    }
}
