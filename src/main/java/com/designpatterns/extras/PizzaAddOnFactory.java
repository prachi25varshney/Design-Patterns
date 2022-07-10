package com.designpatterns.extras;

import com.designpatterns.decorator.Pizza;
import com.designpatterns.decorator.PizzaAddOn;
import com.designpatterns.decorator.PizzaAddOnType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzaAddOnFactory {

    List<PizzaAddOn> pizzaAddOns;
    private static Map<String,PizzaAddOn> addOnMap = new HashMap();

    public PizzaAddOnFactory(List<PizzaAddOn> pizzaAddOns) {
        this.pizzaAddOns = pizzaAddOns;
        for(PizzaAddOn addon : pizzaAddOns){
            addOnMap.put(addon.getType().name(),addon);
        }
    }

    public static Pizza getPizzaAddOns(PizzaAddOnType pizzaAddOnType) {
        return addOnMap.get(pizzaAddOnType.name());
    }
}
