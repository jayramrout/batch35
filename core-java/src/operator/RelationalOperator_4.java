package operator;

public class RelationalOperator_4 {
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

        boolean canTheyBeInSameTeam = (isAgeEqual || isSameHeight);

        // AND &&
        // OR ||
        // if height is same OR age is same , then they can be in the same team.

        //System.out.println( canTheyBeInSameTeam ? "Yes can be in the same team ": "Sorry no same team.");

        /*if(canTheyBeInSameTeam) {
            System.out.println("Yes can be in the same team ");
            if(name1 == name2){
                System.out.println("Can play in the same match also");
            }else {
                System.out.println("Will play in the next match..");
            }
        } else {
            System.out.println("Sorry no same team.");
        }*/

        if (canTheyBeInSameTeam)
            System.out.println("Yes can be in the same team ");

        // TODO : have a false if condition and have two statements under it.

        if(false)
            System.out.println("Something1");
            System.out.println("Something2");
    }
}
