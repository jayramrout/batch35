package jrout.tutorial.batch35.springcore;

import lombok.Data;

@Data
public class BuildCar { // build is dependent on what ??

    public BuildCar(){
        System.out.println("Build Car default Constructor");
    }

    private Engine engine; // dependency
    public void buildCar(){
        System.out.println("Engine is added.." + engine.getEngineType());
    }


}
