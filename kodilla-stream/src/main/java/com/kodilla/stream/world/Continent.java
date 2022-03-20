package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countryInContinent = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countryInContinent.add(country);
    }

    public List<Country> getCountries() {
        return countryInContinent;
    }
}
