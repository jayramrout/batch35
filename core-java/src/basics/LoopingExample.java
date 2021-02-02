package basics;
// java ArrayExample_forLoop  1 2 3 4 5
public class LoopingExample {
    public static void main(String[] args) {
        String names[] = {"Peter","Dan","Kan","Bob"};
        int ages[] = {10,20,30,40}; // creation and initialization at the same time.

        /*for (int i = 0; i < names.length; i++){
            System.out.println("Name ="+ names[i] +" Age is ="+ ages[i]);
        }*/

        /*int i = 0;
        while (i < names.length){
            System.out.println("Name ="+ names[i] +" Age is ="+ ages[i]);
            i++;
        }*/

        int i = 0;
        do {
            System.out.println("Name ="+ names[i] );
            i++;
        }while (i < names.length);

    }
}
