package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continentsInWorld = new ArrayList<>();

    public void addContinent(Continent continent){
        continentsInWorld.add(continent);
    }

    // W  klasie  World   napisz  metodę  getPeopleQuantity()   zwracającą
    //liczbę  typu
    //BigDecimal
    //,  która  używając  flatMap()   oraz  reduce()
    //obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        peopleQuantity = continentsInWorld.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
