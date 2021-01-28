package operator;

public class RelationalOperator_5 {
    public static void main(String[] args) {
        String name1 = "Sam";
        int age1 = 30; // camel case
        int height1 = 5;

        String name2 = "Peter";
        int age2 = 20;
        int height2 = 5;

        boolean isAgeEqual = (age1 == age2); // deriving
        System.out.println("isAgeEqual = " + isAgeEqual);

        boolean isSameHeight = height1 == height2;
        System.out.println("isSameHeight = " + isSameHeight);

        //boolean canTheyBeInSameTeam = (isAgeEqual || isSameHeight);


        // isSameHeight && (lastName || sameAge)
        boolean belongToSameFamily = isSameHeight
                && (name1 == name2 || isAgeEqual);

        System.out.println("belongToSameFamily = " + belongToSameFamily);

    }
}
