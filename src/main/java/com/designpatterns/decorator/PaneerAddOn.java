package com.designpatterns.decorator;

import java.util.List;

public class PaneerAddOn extends PizzaAddOn {

    Pizza pizza;

    public PaneerAddOn(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> getToppings() {
        List<String> topping = this.pizza.getToppings();
        topping.add("Paneer");
        return topping;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 80;
    }

    @Override
    public PizzaAddOnType getType() {
        return PizzaAddOnType.PANEER;
    }
}
