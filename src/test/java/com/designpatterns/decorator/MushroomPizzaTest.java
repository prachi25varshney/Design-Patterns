package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MushroomPizzaTest {

    @Test
    void getListOfMushroomPizzaToppings() {
        List<String> expectedList = new ArrayList<>(List.of("Mushrooms", "Cheese"));
        MushroomPizza mushroomPizza = new MushroomPizza();

        assertEquals(expectedList, mushroomPizza.getToppings());
    }

    @Test
    void getCostOfMushroomPizza() {
        int expectedCost = 180;
        MushroomPizza mushroomPizza = new MushroomPizza();

        assertEquals(expectedCost, mushroomPizza.getCost());
    }
}
