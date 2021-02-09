package classexample;

public class ConstructorExample {
    public static void main(String[] args) {
        new Person();
//        new Student();

        // id and name
        Student student = new Student(100);

        System.out.println("student.getId() = " + student.getId());

        Student student1 = new Student(101, "Peter");
        System.out.println(student1.getId() + " " + student1.getName());

        Student student2 = new Student(105, "Sawn", 18, null);
        System.out.println("student2.getAge() = " + student2.getAge());
    }

}
