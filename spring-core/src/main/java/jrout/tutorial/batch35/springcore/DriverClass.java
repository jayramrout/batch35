package jrout.tutorial.batch35.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {

        /*FourStrokeEngine fourStrokeEngine = new FourStrokeEngine();
        fourStrokeEngine.setEngineType("4 SE");

        BuildCar buildCar = new BuildCar();
        buildCar.setEngine(fourStrokeEngine);
        buildCar.buildCar();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BuildCar buildCar = context.getBean("buildCar", BuildCar.class);
        buildCar.buildCar();
/*
        buildCar = context.getBean("buildCar", BuildCar.class);
        buildCar.buildCar();

        buildCar = context.getBean("buildCar", BuildCar.class);
        buildCar.buildCar();

        buildCar = context.getBean("buildCar", BuildCar.class);
        buildCar.buildCar();*/


    }
}
