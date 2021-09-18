package ru.si14bet.hazelcast.model.events;

import java.util.List;

public class Tournament {
    private String id;
    private String name;

    public Tournament(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private List<String> matchIds;

    public void addMatch(String match){
        matchIds.add(match);
    }

    List<String> getMatchIds(){
        return matchIds;
    }
}
