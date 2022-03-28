package com.kodilla.exception.test;

public class FlightFindRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Krakow", "Warszawa");
        Flight flight2 = new Flight("Krakow", "Gdansk");
        Flight flight3 = new Flight("Krakow", "Katowice");

        FlightFinder findFlight = new FlightFinder();
        try {
            findFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: Arrival airport does not exist.");
        } finally {
            System.out.println("End of the search.");
        }

    }
}
