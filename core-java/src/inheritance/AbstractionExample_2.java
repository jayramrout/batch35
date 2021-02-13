package inheritance;

public class AbstractionExample_2 {
    public static void main(String[] args) {
        Pet pet = null;
        pet = new Cat();
        pet.shelter();

        pet = new Dog();
        pet.shelter();

        pet = new Fish();
        pet.shelter();
    }



}
