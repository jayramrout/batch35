package basics;
// java ArrayExample_forLoop  1 2 3 4 5
public class JumpStatement {
    public static void main(String[] args) {
        String names[] = {"Peter","Dan","Kan","Bob"};

        String nameToFind = "Dan";
        // break and continue;
        boolean isNameFound = false;

        /*for (String name : names) {
            if(name == nameToFind) { // name.equals(nameToFind)
               isNameFound = true;
               break;
            }
        }*/

        for (String name : names) {
            if (name == nameToFind)
                continue;

            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
        }

        System.out.println("Name found "+ isNameFound);

        System.out.println("Testing");

        // TODO : how to reverse a string...
    }
}