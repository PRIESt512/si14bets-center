package ru.si14bet.hazelcast.cache;

import lombok.Data;
import ru.si14bet.hazelcast.model.users.Location;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -1227759841555579608L;
    private Long id;
    private String userId;
    private String registrationCode;
    private BigDecimal amount;
    private String keycloackUserId;
    private String referalLink;
    private String status;
    private Location location;
    private LocalDateTime registrationDate;
}
