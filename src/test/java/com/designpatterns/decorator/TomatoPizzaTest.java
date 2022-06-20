package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TomatoPizzaTest {

    @Test
    void getListOfTomatoPizzaToppings() {
        List<String> expectedList = new ArrayList<>(Arrays.asList("Mushrooms", "Cheese"));
        TomatoPizza tomatoPizza = new TomatoPizza();

        assertEquals(expectedList, tomatoPizza.getToppings());
    }

    @Test
    void getCostOfTomatoPizza() {
        int expectedCost = 187;
        TomatoPizza tomatoPizza = new TomatoPizza();

        assertEquals(expectedCost, tomatoPizza.getCost());
    }
}
