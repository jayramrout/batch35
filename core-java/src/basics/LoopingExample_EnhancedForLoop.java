package basics;
// java ArrayExample_forLoop  1 2 3 4 5
public class LoopingExample_EnhancedForLoop {
    public static void main(String[] args) {
        String names[] = {"Peter","Dan","Kan","Bob"};

        /*for(int i = 0 ; i < names.length; i++) {
            System.out.println(names[i]);
        }*/
        // Enhanced for loop...
        for(String name : names){
            System.out.println(name);
        }
    }
}
