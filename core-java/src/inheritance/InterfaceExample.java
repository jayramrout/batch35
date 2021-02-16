package inheritance;

public class InterfaceExample {

    public static void main(String[] args) {
        ISwimming dogSwim = new Dog();
        dogSwim.swim();

        ISwimming fishSwim = new Fish();
        fishSwim.swim();

        InterfaceExample ie = new InterfaceExample();
        ie.printSwimmingDetails(dogSwim);
        ie.printSwimmingDetails(fishSwim);

//        ie.jump(dogSwim);
    }

    public void printSwimmingDetails(ISwimming swimming){
        swimming.swim();
    }

    public void jump(IJumping iJumping){
        iJumping.jump();
    }
}
