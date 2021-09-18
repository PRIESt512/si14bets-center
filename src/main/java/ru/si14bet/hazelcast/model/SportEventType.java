package ru.si14bet.hazelcast.model;

public enum SportEventType {
    SOCCER("sr:sport:1");
//    BASKETBALL("sr:sport:155"),
//    TENNIS("sr:sport:5");


    private String id;

    SportEventType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static SportEventType getById(String id){
        for (SportEventType sportEventType: SportEventType.values()){
            if(sportEventType.getId().equals(id)){
                return sportEventType;
            }
        }
        return null;
    }
}
