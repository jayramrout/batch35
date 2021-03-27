package jrout.tutorial.batch35.dvdapp.service.impl;

import jrout.tutorial.batch35.dvdapp.dao.IActorDAO;
import jrout.tutorial.batch35.dvdapp.domain.Actor;
import jrout.tutorial.batch35.dvdapp.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActorServiceImpl implements IActorService {

    @Autowired
    private IActorDAO actorDAO;

    @Override
    public Actor fetchActor(int actorId) {
        Actor actor = actorDAO.fetchActor(actorId);
        if(actor.getFirstName().startsWith("Z")){
            actor.setActorTag("Funny Actor");
        }

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
