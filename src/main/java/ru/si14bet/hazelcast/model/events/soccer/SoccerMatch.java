package ru.si14bet.hazelcast.model.events.soccer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.si14bet.hazelcast.model.events.TeamMatch;

@Data
@EqualsAndHashCode(callSuper = true)
public class SoccerMatch extends TeamMatch {

    private SoccerStatistic statistic;
}
