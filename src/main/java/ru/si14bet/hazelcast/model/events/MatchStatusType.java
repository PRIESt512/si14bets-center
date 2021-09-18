package ru.si14bet.hazelcast.model.events;

public enum MatchStatusType {

    /**
     * Матч еще не начался
     */
    NOT_STARTED(0, "not_started"),

    /**
     * Матч идет
     */
    LIVE(1, "live"),

    /**
     * Матч временно приостановлен, но будет продолжен
     */
    SUSPENDED(2, "suspended"),

    /**
     * Матч закончился, окончательные результаты могут быть еще не готовы
     */
    ENDED(3, "ended"),

    /**
     * Матч закончился: окончательные результаты были опубликованы и подтверждены
     */
    FINISHED(4, "closed"),

    /**
     * Матч отменен и не состоится, результатов не будет
     */
    CANCELLED(5, "cancelled"),

    /**
     * Матч прошел запланированное время начала, но задерживается, неизвестно, когда он начнется.
     */
    DELAYED(6, "delayed"),

    /**
     * Матч прерван
     */
    INTERRUPTED(7, "interrupted"),

    /**
     * Матч перенесен на будущее
     */
    POSTPONED(8, "postponed"),

    /**
     * когда Sportradar прерывает разведку матча - это означает,
     * что в реальном времени не будет сообщений о матче, который,
     * скорее всего, состоится в любом случае, и после того,
     * как матч будет сыгран, Sportradar, скорее всего,
     * введет результаты, и матч будет перемещен в closed/finished
     */
    ABANDONED(9, "abandoned"),

    /**
     * Получен неподдерживаемый статус спортивного события
     */
    UNKNOWN(10, "unknown");

    private final int id;
    private final String apiName;

    MatchStatusType(int id, String apiName) {
        this.id = id;
        this.apiName = apiName;
    }

    public static MatchStatusType valueOfApiStatus(String status) {
        for (MatchStatusType type : MatchStatusType.values()) {
            if (type.apiName.equalsIgnoreCase(status))
                return type;
        }
        return UNKNOWN;
    }
}
