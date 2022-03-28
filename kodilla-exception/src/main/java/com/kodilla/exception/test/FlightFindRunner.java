package com.kodilla.exception.test;

public class FlightFindRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Krakow", "Warszawa");
        Flight flight2 = new Flight("Krakow", "Gdansk");
        Flight flight3 = new Flight("Krakow", "Katowice");

        FlightFinder findFlight = new FlightFinder();
        try {
            if (findFlight.findFlight(flight1)) {
                System.out.println("Arrival airport exist and is achievable.");
            } else {
                System.out.println("Arrival airport exist but is not achievable.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: Arrival airport does not exist.");
        } finally {
            System.out.println("End of the search.");
        }

    }
}
