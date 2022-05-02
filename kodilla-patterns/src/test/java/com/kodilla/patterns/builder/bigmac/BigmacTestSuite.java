package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("ONION")
                .bun("BUN WITHOUT SESAME")
                .sauce("STANDARD")
                .ingredient("PRAWNS")
                .ingredient("MUSHROOMS")
                .burgers(2)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals("STANDARD", bigmac.getSauce());
        assertEquals(2, bigmac.getBurgers());
    }
}
