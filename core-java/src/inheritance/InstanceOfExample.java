package inheritance;

public class InstanceOfExample {

    public static void main(String[] args) {

//        float f1 = 10.1f;
//        int a = (int)f1;

//        String name = "Testing";
//        int test = (int)name;

        Pet dog = new Dog();
        Pet fish = new Fish();

        printDetails(dog); // you can call a static method from another static method.
        printDetails(fish);
    }

    public static void printDetails(Pet pet){
        pet.shelter();
        pet.makeNoise();

        if(pet instanceof Dog){
            Dog d = (Dog)pet; // class casting
            d.shakeTail();
        }else if(pet instanceof Fish){
            Fish f = (Fish)pet;
            f.swim();
        }

    }

}
