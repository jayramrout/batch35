package jrout.tutorial.batch35.dvdapp.dao;

import jrout.tutorial.batch35.dvdapp.domain.Actor;

public interface IActorDAO {
    // CRUD
    // READ
    Actor fetchActor(int actorId);
    // DELETE
    boolean deleteActor(int actorId);
    //CREATE
    Actor createActor(Actor actor);

    Actor updateActor(Actor actor);

}
