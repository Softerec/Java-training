package com.kodilla.exception.test;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Krakow", true);
        availableAirports.put("Katowice", true);
        availableAirports.put("Gdansk", true);

        if (availableAirports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Found route.");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
