package jrout.tutorial.batch35.sb;

import jrout.tutorial.batch35.sb.core.BuildCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCoreApplication implements CommandLineRunner {

    @Autowired
    private BuildCar buildCar;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       buildCar.buildCar();
    }
}
