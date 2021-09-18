package ru.si14bet.hazelcast;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class HzHealthCheck {

    private LocalDateTime lastUpdate;
}
