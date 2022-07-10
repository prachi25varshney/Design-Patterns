package com.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderSystemTest {

    @Test
    void shouldReturn410AfterAddingAllTheAddOnsInMushroomPizza() {
        double expPizzaCost = 410;
        List<PizzaAddOnType> pizzaAddOns = new ArrayList<>(List.of(PizzaAddOnType.EXTRACHEESE, PizzaAddOnType.OLIVES,
                PizzaAddOnType.PANEER));
        PizzaOrderSystem orderPizza = new PizzaOrderSystem(PizzaType.MUSHROOM, pizzaAddOns);

        double actPizzaCost = orderPizza.getCost();

        assertEquals(expPizzaCost, actPizzaCost);
    }

    @Test
    void shouldReturnToppingListWIthAllPaneerAndCheeseAndOlivesAddOnAfterAddingThemInMushroomPizza() {
        List<String> expPizzaToppings = new ArrayList<>(List.of("Mushrooms", "Extra-Cheese", "Olives", "Paneer"));
        List<PizzaAddOnType> pizzaAddOns = new ArrayList<>(List.of(PizzaAddOnType.EXTRACHEESE, PizzaAddOnType.OLIVES,
                PizzaAddOnType.PANEER));
        PizzaOrderSystem orderPizza = new PizzaOrderSystem(PizzaType.MUSHROOM, pizzaAddOns);

        List<String> actPizzaToppings = orderPizza.getPizzaToppingList();

        assertEquals(expPizzaToppings, actPizzaToppings);
    }
}
