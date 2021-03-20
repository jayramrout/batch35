package jrout.tutorial.batch35.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass2 {
    public static void main(String[] args) {

//        BuildCar buildCar = new BuildCar();
//        FourStrokeEngine twoStrokeEngine = new FourStrokeEngine();
//        twoStrokeEngine.setEngineType("4 SE");
//        buildCar.setEngine(twoStrokeEngine);
//        buildCar.buildCar();


        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BuildCar buildCar = context.getBean("buildCar", BuildCar.class);
        buildCar.buildCar();



    }
}
