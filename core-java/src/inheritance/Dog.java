package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Pet implements ISwimming , IJumping{

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

    @Override
    public void swim() {
        System.out.println("I am a dog..i love swimming...");
    }

    @Override
    public void jump() {
        System.out.println("I am a dog..who can jump");
    }

    public void shakeTail(){
        System.out.println("I am a dog..and i shake tail when i see friendly people");
    }


}
