package com.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class TomatoPizza implements Pizza {
    @Override
    public List<String> getToppings() {
        return new ArrayList<>(List.of("Tomato", "Cheese"));
    }

    @Override
    public double getCost() {
        return 187;
    }
}
