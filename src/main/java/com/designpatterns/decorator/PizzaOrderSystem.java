package com.designpatterns.decorator;

import java.util.List;

public class PizzaOrderSystem {

    PizzaType pizzaType;
    List<PizzaAddOnType> pizzaAddOns;

    public PizzaOrderSystem(PizzaType pizzaType,List<PizzaAddOnType> pizzaAddOns) {
        this.pizzaType = pizzaType;
        this.pizzaAddOns = pizzaAddOns;
    }

    public double getCost(){
        Pizza pizza = this.pizzaType.getPizza();
        for(PizzaAddOnType pizzaAddOnType : pizzaAddOns){
            pizza = PizzaAddOnFactory.getPizzaAddOns(pizzaAddOnType);
        }
        return pizza.getCost();
    }

    public List<String> getPizzaToppingList(){
        return this.pizzaType.getPizza().getToppings();
    }
}
