package ru.si14bet.hazelcast.cache;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import ru.si14bet.hazelcast.model.events.Match;
import ru.si14bet.hazelcast.model.events.MatchStatusType;


import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class EventBook implements Serializable, Comparable<EventBook> {
    private static final long serialVersionUID = 1318123042624017030L;
    private Match match;
    private LocalDateTime startTime;
    private String eventId;
    private MatchStatusType matchStatusType;

    /**
     * Для сортировки в кеше (помогает для формирования фаворитов и прочее)
     * @param o
     * @return
     */
    @Override
    public int compareTo(@NotNull EventBook o) {
        return startTime.compareTo(o.getStartTime());
    }
//
//    public static void main(String[] args) {
//        //Ключ - тип спортивного события
//        Map<String, EventBook> firstMap;
//        //Ключ - тип спортивного события
//        Map<String, HierarchicalEventStructure> hierarchicalEventStructureMap;
//    }


        //                List<Category> categories = sport.getCategories();
//                for (Category category: categories){
//                    if (category.getId().toString().equals("sr:category:1")){
//                        System.out.println(category.getId()+"-"+category.getName(Locale.ENGLISH));
//                        List<SportEvent> tournaments = category.getTournaments();
//                        for (SportEvent sportEvent: tournaments){
//                            if (sportEvent.getId().toString().equals("sr:tournament:17")){
//                                System.out.println(sportEvent.getName(Locale.ENGLISH)+ " - "+ sportEvent.getId());
//                                Tournament tournament = (Tournament) sportEvent;
//                                CurrentSeasonInfo season = tournament.getCurrentSeason();
//                                    System.out.println(season.getName(Locale.ENGLISH));
//                                    List<Competition> competitions = season.getSchedule();
//                                    for (Competition competition: competitions){
//                                        System.out.println("name: "+competition.getName(Locale.ENGLISH));
//                                        if (competition instanceof MatchImpl){
//                                            MatchImpl match = (MatchImpl) competition;
//                                            match.getName(Locale.ENGLISH);
//                                            match.getStatus().getAwayPenaltyScore();
//                                            match.getStatus().getAwayScore();
//                                            match.getStatus().getHomePenaltyScore();
//                                            match.getStatus().getHomeScore();
//                                            match.getStatus().getMatchStatus(Locale.ENGLISH);
//                                        }
//                                    }
//                            }
//
//                        }
//
 //   }
}
