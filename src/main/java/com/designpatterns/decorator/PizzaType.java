package com.designpatterns.decorator;

public enum PizzaType {

    CHEESE(new CheesePizza()),
    MUSHROOM(new MushroomPizza()),
    TOMATO(new TomatoPizza());

    private final Pizza pizza;

    PizzaType(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
