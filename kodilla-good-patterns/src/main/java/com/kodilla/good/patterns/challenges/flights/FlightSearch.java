package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private List<Flight> returnSetFlishts;// = new Set<Flight>();;
    private List<Flight> flightsList;

    public FlightSearch(List<Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public void findAllToCity(String cityName) {
        System.out.println("\nFlights to city " + cityName + " from:");
        flightsList.stream()
                .filter(l -> l.getTo().equals(cityName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void findAllFromCity(String cityName) {
        System.out.println("\nFlights from city " + cityName + " to:");
        flightsList.stream()
                .filter(c -> c.getFrom().equals(cityName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void findFlightsWithStopTo(String cityName) {
        System.out.println("\nFlights with stop to city " + cityName);
        List<Flight> toCity = flightsList.stream()
                .filter(c -> c.getTo().equals(cityName))
                .collect(Collectors.toList());

        List<Flight> noToCity = flightsList.stream()
                .filter(c -> ! c.getTo().equals(cityName) && ! c.getFrom().equals(cityName) )
                .collect(Collectors.toList());

        for(Flight flightT : toCity) {
            for(Flight flightNt : noToCity) {
                if (flightT.getFrom() == flightNt.getTo()) {
                    System.out.println("Connection flights:");
                    System.out.println(" " + flightNt);
                    System.out.println(" " + flightT);
                }
            }
        }
    }
}