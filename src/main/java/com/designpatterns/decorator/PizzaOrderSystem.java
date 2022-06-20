package com.designpatterns.decorator;

import java.util.List;

public class PizzaOrderSystem {

    Pizza pizza;

    public PizzaOrderSystem(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getCost(){
        return this.pizza.getCost();
    }

    public List<String> getPizzaToppingList(){
        return this.pizza.getToppings();
    }
}
