package jrout.tutorial.springbootrestproducer;

import jrout.tutorial.springbootrestproducer.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringBootRestProducerApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void restClient(){
        Employee forObject = restTemplate.getForObject("http://localhost:8080/employee?id=102", Employee.class);
        System.out.println(forObject);
    }
}
