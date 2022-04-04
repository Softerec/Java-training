package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchApp {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Krakow", "Warszawa");
        Flight flight2 = new Flight("Warszawa", "Krakow");
        Flight flight3 = new Flight("Warszawa", "Gransk");
        Flight flight4 = new Flight("Gransk", "Warszawa");
        Flight flight5 = new Flight("Gransk", "Krakow");

        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);
        flightsList.add(flight5);

        FlightSearch search = new FlightSearch(flightsList);

        search.findAllToCity("Krakow");
        search.findAllFromCity("Krakow");
        search.findFlightsWithStopTo("Krakow");
    }
}
