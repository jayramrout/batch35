package inheritance;

public class Fish extends Pet implements ISwimming {

    @Override
    public void shelter() {
        System.out.println("I a fish and I need a water to sleep");
    }

    @Override
    public void swim() {
        System.out.println("I am a fish..and i am born to swim...");
    }
}
