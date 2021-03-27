package jrout.tutorial.batch35.dvdapp.dao.impl;

import jrout.tutorial.batch35.dvdapp.dao.IActorDAO;
import jrout.tutorial.batch35.dvdapp.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActorDAOImpl implements IActorDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Actor fetchActor(int actorId) {

//        Actor actor = jdbcTemplate.queryForObject("select * from actor where actor_id = " + actorId, Actor.class);

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
