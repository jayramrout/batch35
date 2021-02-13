package inheritance;

public class AbstractionExample {
    public static void main(String[] args) {
        Pet pet = null;
        pet = new Cat();
        pet.setName("Keeen");
        pet.setColor("Black");
        pet.makeNoise();

        pet = new Dog();
        pet.setColor("Brown");
        pet.setName("Doggy");
        pet.makeNoise();
    }



}
