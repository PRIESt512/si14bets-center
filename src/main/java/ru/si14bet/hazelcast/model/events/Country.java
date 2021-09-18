package ru.si14bet.hazelcast.model.events;

import java.util.Collection;
import java.util.Map;


public class Country {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private Map<String, Tournament> tournaments;

    public Country(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addTournament(Tournament tournament){
        tournaments.put(tournament.getId(), tournament);
    }

    public Collection<Tournament> getTournaments(){
        return tournaments.values();
    }

    public Tournament getTournament(String id){
        return tournaments.get(id);
    }
}
