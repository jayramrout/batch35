package jrout.tutorial.batch35.dvdapp.service;

import jrout.tutorial.batch35.dvdapp.domain.Actor;

public interface IActorService {
    // CRUD
    // READ
    Actor fetchActor(int actorId);
    // DELETE
    boolean deleteActor(int actorId);
    //CREATE
    Actor createActor(Actor actor);

    Actor updateActor(Actor actor);
}
