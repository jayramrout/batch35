package inheritance;
/*
    concrete classes or implementation classes
 */
public class Cat extends Pet {

    @Override // annotation is a metadata: data about data
    public void makeNoise() {
        System.out.println("I a make sound as Meow !!");
    }

    @Override
    public void shelter() {
        System.out.println("I a cat and I need a closed Place to sleep");
    }

    @Override
    public void dna() {
        System.out.println("This my dna xxxx9x9x9x9x9x9");
    }
}
