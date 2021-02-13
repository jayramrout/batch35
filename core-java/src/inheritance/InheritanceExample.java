package inheritance;

import classexample.Student;

public class InheritanceExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Keeen");
        cat.setColor("Black");
        cat.makeNoise();

        /*Dog dog = new Dog();
        dog.setColor("Brown");
        dog.setName("Doggy");
        dog.makeNoise();*/

       /* Pet pet = new Pet();
        pet.setColor("Green");
        pet.setName("Mittu");
        pet.makeNoise();*/

       new Fish().makeNoise();
    }
}
