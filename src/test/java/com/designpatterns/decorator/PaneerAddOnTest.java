package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaneerAddOnTest {

    @Test
    void shouldReturnToppingListWithPaneerAddOnAndMushrooms() {
        List<String> expToppingList = new ArrayList<>(List.of("Mushrooms", "Paneer"));
        Pizza pizza = new MushroomPizza();
        pizza = new PaneerAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfMushroomPizzaWithPaneerAddOn() {
        double expTotalCost = 260;
        Pizza pizza = new MushroomPizza();
        pizza = new PaneerAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithPaneerAddOnAndCheese() {
        List<String> expToppingList = new ArrayList<>(List.of("Cheese", "Paneer"));
        Pizza pizza = new CheesePizza();
        pizza = new PaneerAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfCheesePizzaWithPaneerAddOn() {
        double expTotalCost = 230;
        Pizza pizza = new CheesePizza();
        pizza = new PaneerAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithPaneerAddOnAndTomato() {
        List<String> expToppingList = new ArrayList<>(List.of("Tomato", "Cheese", "Paneer"));
        Pizza pizza = new TomatoPizza();
        pizza = new PaneerAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfTomatoPizzaWithPaneerAddOn() {
        double expTotalCost = 267;
        Pizza pizza = new TomatoPizza();
        pizza = new PaneerAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }
}
