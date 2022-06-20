package com.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class MushroomPizza implements Pizza {
    @Override
    public List<String> getToppings() {
        return new ArrayList<>(List.of("Mushrooms"));
    }

    @Override
    public double getCost() {
        return 180;
    }
}
