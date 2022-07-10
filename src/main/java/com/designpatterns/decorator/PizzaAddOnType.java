package com.designpatterns.decorator;

public enum PizzaAddOnType {
    EXTRACHEESE() {
        @Override
        public Pizza getPizzaAddOn(Pizza pizza) {
            return new ExtraCheeseAddOn(pizza);
        }
    },
    PANEER() {
        @Override
        public Pizza getPizzaAddOn(Pizza pizza) {
            return new PaneerAddOn(pizza);
        }
    },
    OLIVES() {
        @Override
        public Pizza getPizzaAddOn(Pizza pizza) {
            return new OlivesAddOn(pizza);
        }
    };

    public abstract Pizza getPizzaAddOn(Pizza pizza);
}
