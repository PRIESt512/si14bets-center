package ru.si14bet.hazelcast.model.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Участник спортивного события
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    private static final long serialVersionUID = 5221560240564177417L;
    private String id;
    private String name;
}
