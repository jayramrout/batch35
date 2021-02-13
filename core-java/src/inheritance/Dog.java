package inheritance;

public class Dog extends Pet {

    @Override
    public void makeNoise(){
        System.out.println("I am a dog and my name is " +
                ""+ getName() +" my color is "+ super.getColor());
        System.out.println("I make noise as Woff!!");
    }

    @Override
    public void shelter() {
        System.out.println("I a dog and I need a Open place sleep");
    }
}
