package operator;

public class RelationalOperator_LogicalAnd {
    public static void main(String[] args) {
        boolean isAgeEqual = true;
        boolean isSameHeight = false;

        boolean canTheyBeInSameTeam = (isAgeEqual | isSameHeight);
//        boolean canTheyBeInSameTeam = (isAgeEqual || isSameHeight);
        System.out.println("canTheyBeInSameTeam = " + canTheyBeInSameTeam);

        // false & true // in logical and , if the first condition is false, it will still go to the next one to check
        // false && true // in short circuit and , if the first condition is false, it will not go to the next one to check
    }
}
