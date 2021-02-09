package classexample;

public class ObjectAsParameter {
    public static void main(String[] args) {

        ObjectAsParameter object = new ObjectAsParameter();
        int x = 10;
        System.out.println("x Before "+ x);
        object.changeData(x); // pass by value
        System.out.println("x After "+x);

        Student student = new Student(107, "Peter");
        System.out.println("Student Before "+ student.getName());
        object.changeData(student);
        System.out.println("Student After "+ student.getName());
    }

    public void changeData(int x){
        x = 20;
    }

    public void changeData(Student student){
        student.setName("Rahul");
    }
}
