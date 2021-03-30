package jrout.tutorial.batch35.dvdapp.service.impl;

import jrout.tutorial.batch35.dvdapp.dao.IActorDAO;
import jrout.tutorial.batch35.dvdapp.domain.Actor;
import jrout.tutorial.batch35.dvdapp.service.IActorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 2015
 */
@Component
public class ActorServiceImpl implements IActorService {

    static Logger logger = Logger.getLogger(ActorServiceImpl.class);

    @Autowired
    private IActorDAO actorDAO;

    @Override
    public Actor fetchActor(int actorId) { // 5 min
//        System.out.println("Entering fetchActor for actorId "+ actorId);
        logger.info("Entering fetchActor for actorId "+ actorId);
        Actor actor = actorDAO.fetchActor(actorId);
        if(actor.getFirstName().startsWith("Z")) {
            logger.debug("In fetchActor for zZZZZZ actorId "+ actorId);
            actor.setActorTag("Funny Actor");
        }
        logger.info("Returning fetchActor for actorId "+ actorId);
        return actor;
    }

    @Override
    public boolean deleteActor(int actorId) {
        return false;
    }

    @Override
    public Actor createActor(Actor actor) {
        return null;
    }

    @Override
    public Actor updateActor(Actor actor) {
        return null;
    }
}
