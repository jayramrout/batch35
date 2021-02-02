package array;
// java ArrayExample_forLoop  1 2 3 4 5
public class ArrayExample_2D_1 {
    public static void main(String[] args) {
        /*
              0     1
        0    Peter 10
        1    Dan    20
        2    Kan  30
        3    Bob    40

         */
        String peterDetails[] =  {"Peter","10"};
        String danDetails[] =  {"Dan","20"};
//        String someMatrix[][][] =
        String personDetails [][] = {
                {"Peter","10"},
                {"Dan","20"},
                {"Kan","30"},
                {"Bob","40"}};

        System.out.println("Name = "+personDetails[2][0] + " Age ="+ personDetails[2][1]);
        // TODO: Loop thru the 2D array and print all the information
        // information like name and age in each line...
        // index and inner loop....
    }
}
