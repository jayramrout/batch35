package jrout.tutorial.batch35.dvdapp.dao;

import jrout.tutorial.batch35.dvdapp.domain.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IActorResource extends CrudRepository<Actor,Integer> {
    List<Actor> findByFirstNameAndLastName(String firstName, String lastName);
}
