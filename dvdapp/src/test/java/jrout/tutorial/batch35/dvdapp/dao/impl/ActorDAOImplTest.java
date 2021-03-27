package jrout.tutorial.batch35.dvdapp.dao.impl;

import jrout.tutorial.batch35.dvdapp.dao.IActorDAO;
import jrout.tutorial.batch35.dvdapp.domain.Actor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActorDAOImplTest {

    @Autowired
    private IActorDAO actorDAO;

    @Test
    void fetchActor() {
        Actor actor = actorDAO.fetchActor(11);
        assertTrue(actor.getFirstName().equals("Zero"));
        assertTrue(actor.getLastName().equals("Cage"));
    }

    @Test
    void deleteActor() {
    }

    @Test
    void createActor() {
    }

    @Test
    void updateActor() {
    }
}
