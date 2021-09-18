package ru.si14bet.hazelcast.model.users;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {
    private static final long serialVersionUID = 6450025503381184258L;
    private Long id;
    private String country;
    private String state;
    private String city;
}
