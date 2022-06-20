package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OlivesAddOnTest {

    @Test
    void shouldReturnToppingListWithOliveAddOnAndMushrooms() {
        List<String> expToppingList = new ArrayList<>(List.of("Mushrooms", "Olives"));
        Pizza pizza = new MushroomPizza();
        pizza = new OlivesAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfMushroomPizzaWithOliveAddOn() {
        double expTotalCost = 230;
        Pizza pizza = new MushroomPizza();
        pizza = new OlivesAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithOliveAddOnAndCheese() {
        List<String> expToppingList = new ArrayList<>(List.of("Cheese", "Olives"));
        Pizza pizza = new CheesePizza();
        pizza = new OlivesAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfCheesePizzaWithOliveAddOn() {
        double expTotalCost = 200;
        Pizza pizza = new CheesePizza();
        pizza = new OlivesAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithOliveAddOnAndTomato() {
        List<String> expToppingList = new ArrayList<>(List.of("Tomato", "Cheese", "Olives"));
        Pizza pizza = new TomatoPizza();
        pizza = new OlivesAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfTomatoPizzaWithOliveAddOn() {
        double expTotalCost = 237;
        Pizza pizza = new TomatoPizza();
        pizza = new OlivesAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }
}
