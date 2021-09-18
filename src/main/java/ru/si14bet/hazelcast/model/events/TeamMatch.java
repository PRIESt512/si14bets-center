package ru.si14bet.hazelcast.model.events;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;


@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TeamMatch extends Match {

    /**
     * Member who win
     */
    private Member winner;

    /**
     * Home team
     */
    private Member home;

    /**
     * Away team
     */
    private Member away;

    /**
     * Home member total score
     */
    private Double homeScore;

    /**
     * Home away total score
     */
    private Double awayScore;

    /**
     * Home member total Penalty score
     */
    private Double homePenaltyScore;

    /**
     * Home away total Penalty score
     */
    private Double awayPenaltyScore;

    /**
     * Part of match score
     */
    private List<PartScore> partScores;



}
