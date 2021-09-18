package ru.si14bet.hazelcast.model.events;

public enum PartType {
    TIME(1),
    QUARTER(2),
    PERIOD(3),
    OVERTIME(5),
    PENALTIES(6),
    OTHER(7),
    SET(4);


    private int id;

    PartType(int id) {
        this.id = id;
    }
}
