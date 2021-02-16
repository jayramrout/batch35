package inheritance;

public class Person implements ISwimming {
    @Override
    public void swim() {
        System.out.println("i can swim");
    }
}
