package ru.si14bet.hazelcast.cache;

import lombok.Data;
import ru.si14bet.hazelcast.model.events.Country;

import java.util.Collection;
import java.util.Map;

@Data
public class HierarchicalEventStructure {
    private Map<String, Country> structure;

    Collection<Country> getCountries(){
        return structure.values();
    }

    public void addCountry(Country country){
        structure.put(country.getId(), country);
    }

    public Country getCountry(String id){
        return structure.get(id);
    }
}
