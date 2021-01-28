package operator;

public class RelationalOperator_3 {
    public static void main(String[] args) {
        String name1 = "Sam";
        int age1 = 30; // camel case
        int height1 = 5;

        String name2 = "Peter";
        int age2 = 29;
        int height2 = 5;

        boolean isAgeEqual = (age1 == age2); // deriving
        System.out.println("isAgeEqual = " + isAgeEqual);

        boolean isSameHeight = height1 == height2;
        System.out.println("isSameHeight = " + isSameHeight);
        // how should they be in the same team.
        /*
            if age is same AND height is equals
                then print they can be in the same team.
                then they cannot be in the same team.
         */
        //                  false        true
        System.out.println(isAgeEqual && isSameHeight);
        // false && false = false
        // false && true = false
        // true && false = false
        // true && true = true
        boolean canTheyBeInSameTeam = (isAgeEqual && isSameHeight);

        System.out.println(canTheyBeInSameTeam ? "Yes they can be in the same team " : "Sorry no same team.");

        // TODO
        /*
            age1 = 29 , age2=30
            height1=5 , height2=5

            if the age difference is between 3 year and age is same then they can be in the same team.
         */

        // Yes they can be in the same team...
    }
}
