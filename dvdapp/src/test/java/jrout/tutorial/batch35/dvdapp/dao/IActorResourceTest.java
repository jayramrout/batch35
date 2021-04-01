package jrout.tutorial.batch35.dvdapp.dao;

import jrout.tutorial.batch35.dvdapp.domain.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IActorResourceTest {

    @Autowired
    private IActorResource iActorResource;

    @Autowired
    EntityManager entityManager;

    @Test
    void findById() {
        // converting premitive to Wrapper
        Optional<Actor> byId = iActorResource.findById(Integer.valueOf(1));
        System.out.println(byId.get());
    }

    @Test
    void findByFirstNameAndLastName(){
        List<Actor> byFirstNameAndLastName = iActorResource.findByFirstNameAndLastName("Nick", "Wahlberg");
        System.out.println(byFirstNameAndLastName.get(0));
    }

    @Test
    void findAllNamedQuery(){
        Query namedQuery = entityManager.createNamedQuery("Actor.findAllEmpoyee");
        List resultList = namedQuery.getResultList();
        resultList.forEach(System.out::println);
    }

    @Test
    void findByLastName(){
        Query namedQuery = entityManager.createNamedQuery("Actor.findByLastName");
        namedQuery.setParameter(1,"Davis");
        List resultList = namedQuery.getResultList();
        resultList.forEach(System.out::println);
    }

}
