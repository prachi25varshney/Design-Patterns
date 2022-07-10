package com.designpatterns.decorator;

import java.util.List;

public class PizzaOrderSystem {

    PizzaType pizzaType;
    List<PizzaAddOnType> pizzaAddOns;

    public PizzaOrderSystem(PizzaType pizzaType, List<PizzaAddOnType> pizzaAddOns) {
        this.pizzaType = pizzaType;
        this.pizzaAddOns = pizzaAddOns;
    }

    public double getCost() {
        Pizza pizza = this.pizzaType.getPizza();
        pizza = getFinalPizza(pizza);
        return pizza.getCost();
    }

    public List<String> getPizzaToppingList() {
        Pizza pizza = this.pizzaType.getPizza();
        pizza = getFinalPizza(pizza);
        return pizza.getToppings();
    }

    private Pizza getFinalPizza(Pizza pizza) {
        for (PizzaAddOnType pizzaAddOnType : pizzaAddOns) {
            pizza = pizzaAddOnType.getPizzaAddOn(pizza);
        }
        return pizza;
    }
}
