package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraCheeseAddOnTest {

    @Test
    void shouldReturnToppingListWithExtraCheeseElementAndMushrooms() {
        List<String> expToppingList = new ArrayList<>(List.of("Mushrooms", "Extra-Cheese"));
        Pizza pizza = new MushroomPizza();
        pizza = new ExtraCheeseAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfMushroomPizzaWithExtraCheeseElement() {
        double expTotalCost = 280;
        Pizza pizza = new MushroomPizza();
        pizza = new ExtraCheeseAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithExtraCheeseElementAndCheese() {
        List<String> expToppingList = new ArrayList<>(List.of("Cheese", "Extra-Cheese"));
        Pizza pizza = new CheesePizza();
        pizza = new ExtraCheeseAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfCheesePizzaWithExtraCheeseElement() {
        double expTotalCost = 250;
        Pizza pizza = new CheesePizza();
        pizza = new ExtraCheeseAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }

    @Test
    void shouldReturnToppingListWithExtraCheeseElementAndTomato() {
        List<String> expToppingList = new ArrayList<>(List.of("Tomato", "Cheese", "Extra-Cheese"));
        Pizza pizza = new TomatoPizza();
        pizza = new ExtraCheeseAddOn(pizza);

        List<String> actualToppingList = pizza.getToppings();

        assertEquals(expToppingList, actualToppingList);

    }

    @Test
    void shouldReturnTotalCostOfTomatoPizzaWithExtraCheeseElement() {
        double expTotalCost = 287;
        Pizza pizza = new TomatoPizza();
        pizza = new ExtraCheeseAddOn(pizza);

        double actualTotalCost = pizza.getCost();

        assertEquals(expTotalCost, actualTotalCost);

    }
}
