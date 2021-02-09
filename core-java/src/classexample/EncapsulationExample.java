package classexample;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student(100);
        student.setId(100);
        System.out.println("student.getId() = " + student.getId());
        student.setAge(18);
        System.out.println("student.getAge() = " + student.getAge());
//        student.age = -10;
//        System.out.println("student = " + student.age);
        /*student.age = -50;
        student.id = 44;
        student.name = "Peter";
        String subjs[] = {"Math","Science"};
        student.subjects = subjs;

        // how much discount will this student get
        // if age > 45 and student subject has Math
        boolean hasDiscount = false;
        if(student.age > 45 ){
            for(String sub : student.subjects){
                if(sub.equals("Math")){
                    hasDiscount = true;
                    break;
//                    System.out.println("You get 20% discount");
                }
            }
        }

        if(hasDiscount){
            System.out.println("You get 20% discount");
        }
        System.out.println("Student age is :"+student.age);*/

    }

}
