package inheritance;

public abstract class Pet {
    private String name;
    private String color;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void makeNoise() {
        System.out.println("Hi my name " +
                "is "+ this.name +" my color is "+ this.color);
        System.out.println("I don't know what noise i make");
    }

    public abstract void shelter();

//    public abstract void dna();
}
