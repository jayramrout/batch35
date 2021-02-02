package array;
// java ArrayExample_forLoop  1 2 3 4 5
public class ArrayExample_2D {
    public static void main(String[] args) {
        String names[] = {"Peter","Dan","Kan","Bob"};

        String ages[] = {"10","20","30","40"}; // creation and initialization at the same time.
        // Integer.parseInt("10")
        /*
              0     1
        0    Peter 10
        1    Dan    20
        2    Kan  30
        3    Bob    40

         */
        String personDetails [][] = new String[4][2];
        personDetails[0][0] = "Peter";
        personDetails[0][1] = "10";

        personDetails[1][0] = "Dan";
        personDetails[1][1] = "20";

        personDetails[2][0] = "Kan";
        personDetails[2][1] = "30";

        personDetails[3][0] = "Bob";
        personDetails[3][1] = "40";

        System.out.println(personDetails); // Hexadecimal rep. of the memory addreess..

    }
}
