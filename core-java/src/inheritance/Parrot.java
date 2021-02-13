package inheritance;

public  class Parrot extends Pet {
    
    @Override
    public void makeNoise(){
        System.out.println("I am a parrot and my name is " +
                ""+ getName() +" my color is "+ super.getColor());
        System.out.println("I make all kind if noises!!");
    }

    @Override
    public void shelter() {
        System.out.println("I a dog and cage to sleep");
    }

}
