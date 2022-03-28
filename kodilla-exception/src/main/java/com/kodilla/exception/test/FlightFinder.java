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

        boolean foundCity = false;
        for(Map.Entry<String, Boolean> entry :availableAirports.entrySet()){
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                foundCity = true;
                System.out.println("Arrival airpot exist.");
            }
        }

        if (foundCity) {
            System.out.println("Found route.");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
