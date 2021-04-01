package jrout.tutorial.batch35.dvdapp.dao;

import jrout.tutorial.batch35.dvdapp.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IActorResource extends CrudRepository<Actor,Integer> {

    @Override
    Optional<Actor> findById(Integer aLong);

    List<Actor> findByFirstNameAndLastName(String firstName, String lastName);

}
