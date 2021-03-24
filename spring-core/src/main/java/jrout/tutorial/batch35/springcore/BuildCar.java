package jrout.tutorial.batch35.springcore;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class BuildCar { // build is dependent on what ??

    @Autowired
    @Qualifier("4se")
    private IEngine engine; // dependency

    public BuildCar(){
        System.out.println("Build Car default Constructor");
    }
    public void buildCar(){
        System.out.println("Engine is added.." + engine.getEngineType());
    }
}
