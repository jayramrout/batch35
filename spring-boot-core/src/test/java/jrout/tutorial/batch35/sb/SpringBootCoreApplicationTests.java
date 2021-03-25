package jrout.tutorial.batch35.sb;

import jrout.tutorial.batch35.sb.core.BuildCar;
import jrout.tutorial.batch35.sb.core.IEngine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCoreApplicationTests {

    @Autowired
    @Qualifier("4se")
    IEngine engine;

    @Autowired
    private BuildCar buildCar;

    @Test
    void contextLoads() {
    }

    @Test
    void testFourStrokeEngine(){
//        assertTrue(engine.getEngineType().equals("Four Stroke Engine"));
        assertEquals(engine.getEngineType(),"Four Stroke Engine");
    }

    @Test
    void testBuildCar(){
        buildCar.buildCar();
    }
}
