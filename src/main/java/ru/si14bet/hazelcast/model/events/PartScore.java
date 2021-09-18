package ru.si14bet.hazelcast.model.events;

import lombok.Data;

@Data
public class PartScore {
    /**
     * Home member part score
     */
    private Double homeScore;

    /**
     * Home away part score
     */
    private Double awayScore;

    /**
     * Type of match part
     */
    private PartType partType;

    /**
     * number of match part
     */
    private int partNumber;
}
