package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void  testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("41000000"));
        Country country2 = new Country("Ukraine", new BigDecimal("41000000"));
        Country country3 = new Country("Czech", new BigDecimal("10000000"));

        Country country11 = new Country("China", new BigDecimal("1412600000"));
        Country country12 = new Country("India", new BigDecimal("1352642280"));

        Country country21 = new Country("Angola", new BigDecimal("31127674"));
        Country country22 = new Country("Zambia", new BigDecimal("17351708"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        World stillInOnePiece = new World();

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country11);
        continent2.addCountry(country12);

        continent3.addCountry(country21);
        continent3.addCountry(country22);

        stillInOnePiece.addContinent(continent1);
        stillInOnePiece.addContinent(continent2);
        stillInOnePiece.addContinent(continent3);

        BigDecimal peopleQuantity = stillInOnePiece.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2905721662");
        assertEquals(expectedPeopleQuantity, peopleQuantity);
    }

    @Test
    void  testCountriesInContinents() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("41000000"));
        Country country2 = new Country("Ukraine", new BigDecimal("41000000"));
        Country country3 = new Country("Czech", new BigDecimal("10000000"));

        Country country11 = new Country("China", new BigDecimal("1412600000"));
        Country country12 = new Country("India", new BigDecimal("1352642280"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country11);
        continent2.addCountry(country12);

        //Then
        assertEquals(3, continent1.getCountries().size());
        assertEquals(2, continent2.getCountries().size());
        assertEquals(0, continent3.getCountries().size());

        assertTrue(continent1.getCountries().contains(country1));
        assertTrue(continent1.getCountries().contains(country2));
        assertTrue(continent1.getCountries().contains(country3));

        assertFalse(continent1.getCountries().contains(country11));
        assertTrue(continent2.getCountries().contains(country11));
        assertTrue(continent2.getCountries().contains(country12));

        assertFalse(continent2.getCountries().contains(country1));
        assertFalse(continent3.getCountries().contains(country1));
        assertFalse(continent3.getCountries().contains(country12));
    }

    @Test
    void  testPopulationInCountries() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("41000000"));
        Country country12 = new Country("India", new BigDecimal("1352642280"));
        //When
        //Then
        assertEquals(new BigDecimal("41000000"), country1.getPeopleQuantity());
        assertEquals(new BigDecimal("1352642280"), country12.getPeopleQuantity());
    }
}
