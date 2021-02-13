package classexample;

public class SetterGetterExample {
    public static void main(String[] args) {
        Student student = new Student();
        Address address = new Address();
        address.country = "Usa";
        student.setAddress(address);
//        student.validate();
        // set

        // get

        Student student1 = new Student();
//        student.id = 100;
//        System.out.println(student.id);

        student.setId(100);
        student.setName("Peter");

//        student.setAge(-10);
        SetterGetterExample obj = new SetterGetterExample();
//        obj.setAge(-10);
    }


}
