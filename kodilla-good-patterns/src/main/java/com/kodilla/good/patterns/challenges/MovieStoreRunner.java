package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> moviesMap = movieStore.getMovies();
        String movies = moviesMap.values().stream()
                .flatMap(movie -> movie.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}
