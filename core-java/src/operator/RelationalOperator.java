package operator;

public class RelationalOperator {
    public static void main(String[] args) {
        int samAge = 20; // camel case
        int peterAge = 30;
        // true false ????
        boolean isEqual = (samAge == peterAge);

//        System.out.println("Is Age same ? "+ (samAge == peterAge));
        System.out.println("Is Age same ? "+ isEqual);
        System.out.println("Is Age Diff ? "+ (samAge != peterAge));
        System.out.println("Is 1st greater than 2nd ? "+ (samAge > peterAge));
//        boolean true false;

    }
}
