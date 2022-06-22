package com.designpatterns.decorator;

import java.util.List;

public class ExtraCheeseAddOn extends PizzaAddOn {

    Pizza pizza;

    public ExtraCheeseAddOn(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> getToppings() {
        List<String> topping = this.pizza.getToppings();
        topping.add("Extra-Cheese");
        return topping;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 100;
    }

    @Override
    public PizzaAddOnType getType() {
        return PizzaAddOnType.EXTRACHEESE;
    }
}
