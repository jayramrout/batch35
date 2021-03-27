package jrout.tutorial.batch35.dvdapp.service.impl;

import jrout.tutorial.batch35.dvdapp.domain.Actor;
import jrout.tutorial.batch35.dvdapp.service.IActorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActorServiceImplTest {

    @Autowired
    private IActorService iActorService;

    @Test
    void fetchActor() {
        Actor actor = iActorService.fetchActor(11);
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
