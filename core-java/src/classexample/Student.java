package classexample;

public class Student {
    private int id;
    private String name;
    private String [] subjects;
    private int age;
    private Address address; // has-a relationship

    /*public Student(){ // default construct...

    }*/
    public Student(){}

    public Student(int id){
        this.id = id;
    }

    // Constructor Overloading..
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age, Address address){
//        this.id = id;
//        this.name = name;
//        this.age = age;
        this(id,name,age); // constructor chaining...
        this.setAddress(address);
    }


    public void setId(int idx){
        this.id = idx;
    }
    
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 15)
            this.age = 15;
        else
            this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /*
    public boolean validate(){
        // if address is valid..if id is valie...
    }
    */
}
