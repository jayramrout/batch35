package operator;

public class RelationalOperator_2 {
    public static void main(String[] args) {
        String name1 = "Sam";
        int age1 = 30; // camel case
        int height1 = 5;

        String name2 = "Peter";
        int age2 = 20;
        int height2 = 5;

        boolean isAgeEqual = (age1 == age2); // deriving
        //System.out.println(!isAgeEqual);
        // if the age is equals and the name starts with S then I would say that both the person
        // belongs to the same team.

        boolean isSameHeight = height1 == height2;

        System.out.println(isAgeEqual ? "Age is Equal" : "Age is Different");
        // TODO print the age information also.

        // how should they be in the same team.
        /*
            if age is same AND height is equals
                then print they can be in the same team.
                then they cannot be in the same team.
         */



    }
}
