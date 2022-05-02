package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.checkers.Pawn;
import com.kodilla.patterns.builder.checkers.Queen;
import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final Integer burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();
    //
    public static final String BUNWITH = "BUN WITH SESAME";
    public static final String BUNWITHOUT = "BUN WITHOUT SESAME";

    //sauce
    public static final String STANDARD = "STANDARD";
    public static final String THOUSANDISLANDS = "1000 ISLANDS";
    public static final String BARBECUE = "BARBECUE";

    //ingredients
    public static final String SALAD = "SALAD";
    public static final String ONION = "ONION";
    public static final String BECON = "BECON";
    public static final String PICKLE = "PICKLE";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";

    private Bigmac(final String bun, final Integer burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private Integer burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(BUNWITH) || bun.equals(BUNWITHOUT)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Type of bun should be BUN WITH SESAME or BUN WITHOUTH SESAME");
            }
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(THOUSANDISLANDS) || sauce.equals(BARBECUE) ) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Type of bun should be STANDARD or 1000 ISLANDS or BARBECUE");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals(SALAD) || ingredient.equals(ONION)
                || ingredient.equals(BECON) || ingredient.equals(PICKLE)
                || ingredient.equals(MUSHROOMS) || ingredient.equals(PRAWNS)
                || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
                return this;
            } else {
                String exceptionStr1 = SALAD + ", " + ONION + ", " + BECON +", "+PICKLE;
                String exceptionStr2 = ", "+ MUSHROOMS +", " + PRAWNS +" or "+ CHEESE;
                throw new IllegalStateException("Type of bun should be " + exceptionStr1 + exceptionStr2);
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients) ;
        }
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
