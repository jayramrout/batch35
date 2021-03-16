package jrout.tutorial.batch35.servlet.controller.dao;

import jrout.tutorial.batch35.servlet.controller.domain.Actor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActorDAO {
    static List<Actor> actors = new ArrayList<>();
    static {
        actors.add(new Actor(1,"Nick","B"));
        actors.add(new Actor(4,"Peter","Craig"));
        actors.add(new Actor(2,"Nick","A"));
        actors.add(new Actor(3,"Nick","C"));
    }

    public List<Actor> findActor(String fname){
        List<Actor> collect = actors.stream()
                .filter(act -> act.getFname().equals(fname))
                .collect(Collectors.toList());
        return collect;
    }
}
