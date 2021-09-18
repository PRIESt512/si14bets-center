package ru.si14bet.hazelcast.model.events;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Объект, который описывает спортивное событие, футбольный матч, баскетбольный матч, теннис
 */
public class Match implements Serializable {
    private static final long serialVersionUID = -2347221517014812035L;

    private String id;
    private String name;
    private LocalDateTime startTime;
    private List<Member> members;
    private MatchStatusType matchStatusType;

    public Match() {
    }

    public Match(String id, String name, LocalDateTime startTime, List<Member> members, MatchStatusType matchStatusType) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.members = members;
        this.matchStatusType = matchStatusType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public MatchStatusType getMatchStatusType() {
        return matchStatusType;
    }

    public void setMatchStatusType(MatchStatusType matchStatusType) {
        this.matchStatusType = matchStatusType;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", members=" + members +
                ", matchStatusType=" + matchStatusType +
                '}';
    }
}
