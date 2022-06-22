package com.designpatterns.decorator;

import java.util.List;

public class OlivesAddOn extends PizzaAddOn {

    Pizza pizza;

    public OlivesAddOn(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> getToppings() {
        List<String> topping = this.pizza.getToppings();
        topping.add("Olives");
        return topping;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 50;
    }

    @Override
    public PizzaAddOnType getType() {
        return PizzaAddOnType.OLIVES;
    }
}
