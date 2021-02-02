package array;
// java ArrayExample_forLoop  1 2 3 4 5
public class ArrayExample_forLoop {
    public static void main(String[] args) {

//        System.out.println("name 1 arg "+ args[0]);
//        System.out.println("name 2 arg "+ args[1]);
        int ages[] = {10,20,30,40}; // creation and initialization at the same time.
        System.out.println("Length of array : "+ages.length);
//        System.out.println(ages[0]);
        // loop : for while do-while
        int ageLength = ages.length;
        for(int idx = 0 ; idx < ageLength; idx++) {
            System.out.println("ages[idx] "+ages[idx]);
            // if... TODO: print the text as below...
            if(ages[idx] == 10) {
                System.out.println("Your age is TEN");
            }
            // Your age is TEN
            // Your age is TWENTY
            // Your age is THIRTY
        }

    }
}
