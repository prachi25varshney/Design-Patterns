package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheesePizzaTest {

    @Test
    void getListOfCheesePizzaToppings() {
        List<String> expectedList = new ArrayList<>(List.of("Cheese"));
        CheesePizza cheesePizza = new CheesePizza();

        assertEquals(expectedList, cheesePizza.getToppings());
    }

    @Test
    void getCostOfCheesePizza() {
        int expectedCost = 150;
        CheesePizza cheesePizza = new CheesePizza();

        assertEquals(expectedCost, cheesePizza.getCost());
    }
}
