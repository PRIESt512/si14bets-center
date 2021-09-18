package ru.si14bet.hazelcast.model.events.soccer;

import lombok.Getter;

@Getter
public enum SoccerMatchStatusType {
    /**
     * Матч еще не начался
     */
    NOT_STARTED(0, "not_started"),

    /**
     * Матч начался
     */
    STARTED(1, "started"),

    /**
     * Первая половина матча
     */
    FIRST_HALF(2, "1st_half"),

    /**
     * Вторая половина матча
     */
    SECOND_HALF(4, "2nd_half"),

    /**
     * Овертайм
     */
    OVERTIME(5, "overtime"),

    /**
     * Матч в первом дополнительном периоде
     */
    FIRST_EXTRA(6, "1st_extra"),

    /**
     * Матч во втором дополнительном периоде
     */
    SECOND_EXTRA(7, "2nd_extra"),

    /**
     * Ожидание пенальти
     */
    AWAITING_PENALTIES(8, "awaiting_penalties"),

    /**
     * Пенальти продолжается
     */
    PENALTIES(9, "penalties"),

    /**
     * Ожидание, когда судья объявит дополнительное время
     */
    AWAITING_EXTRA_TIME(10, "awaiting_extra_time"),

    /**
     * Матч прерван
     */
    INTERRUPTED(11, "interrupted"),

    /**
     * когда Sportradar прерывает разведку матча - это означает,
     * что в реальном времени не будет сообщений о матче, который,
     * скорее всего, состоится в любом случае, и после того,
     * как матч будет сыгран, Sportradar, скорее всего,
     * введет результаты, и матч будет перемещен в closed/finished
     */
    ABANDONED(12, "abandoned"),

    /**
     * Матч перенесен на будущее
     */
    POSTPONED(13, "postponed"),

    /**
     * Матч временно отложен и будет продолжен
     */
    START_DELAYED(14, "start_delayed"),

    /**
     * Матч отменен и не будет сыгран
     */
    CANCELLED(15, "cancelled"),

    /**
     * Матч в перерыве
     */
    HALFTIME(16, "halftime"),

    /**
     * Добавлено дополнительное время
     */
    EXTRA_TIME_HALFTIME(17, "extra_time_halftime"),

    /**
     * Матч окончен
     */
    ENDED(18, "ended"),

    /**
     * Матч завершен после дополнительного времени
     */
    AET(19, "aet"),

    /**
     * Матч завершен после пенальти
     */
    AP(20, "ap"),

    /**
     * если получен неподдерживаемый статус спортивного события
     */
    UNKNOWN(21, "unknown");

    private final int id;
    private final String apiName;

    SoccerMatchStatusType(int id, String apiName) {
        this.id = id;
        this.apiName = apiName;
    }

    public static SoccerMatchStatusType valueOfApiStatus(String status) {
        for (SoccerMatchStatusType type : SoccerMatchStatusType.values()) {
            if (type.apiName.equalsIgnoreCase(status))
                return type;
        }
        return UNKNOWN;
    }
}
