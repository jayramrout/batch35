package jrout.tutorial.batch35.dvdapp.dao.impl;

import jrout.tutorial.batch35.dvdapp.dao.IActorDAO;
import jrout.tutorial.batch35.dvdapp.domain.Actor;
import jrout.tutorial.batch35.dvdapp.service.impl.ActorServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActorDAOImpl implements IActorDAO {
    static Logger logger = Logger.getLogger(ActorDAOImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Actor fetchActor(int actorId) {
//        System.out.println("Entering ActorDAOImpl.fetchActor"+ actorId);
        logger.info("Entering ActorDAOImpl.fetchActor"+ actorId);
//        Actor actor = jdbcTemplate.queryForObject("select * from actor where actor_id = " + actorId, Actor.class);

//        if(actorId == 11)
//            throw new RuntimeException("Some exction ");

        /*List<Actor> query = jdbcTemplate.query("select * from actor where actor_id = ?",
                new Object[]{Integer.valueOf(actorId)},
                new RowMapper<Actor>() {
                    @Override
                    public Actor mapRow(ResultSet resultSet, int i) throws SQLException {
                        Actor actor = new Actor();
                        actor.setActorId(resultSet.getInt("actor_id"));
                        actor.setFirstName(resultSet.getString("first_name"));
                        actor.setLastName(resultSet.getString("last_name"));
                        actor.setLastUpdated(resultSet.getDate("last_update"));
                        return actor;
                    }
                });*/

        Actor actor = (Actor)jdbcTemplate.queryForObject("select * from actor where actor_id = ?",
                new BeanPropertyRowMapper(Actor.class),
                Integer.valueOf(actorId));

        logger.info("Exiting ActorDAOImpl.fetchActor"+ actor);
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
