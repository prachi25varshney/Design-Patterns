package com.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class CheesePizza implements Pizza {
    @Override
    public List<String> getToppings() {
        return new ArrayList<>(List.of("Cheese"));
    }

    @Override
    public double getCost() {
        return 150;
    }
}
