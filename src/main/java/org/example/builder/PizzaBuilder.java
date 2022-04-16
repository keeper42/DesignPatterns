package org.example.builder;

import org.example.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */

public abstract class PizzaBuilder {

    String name;
    List<String> toppings = new ArrayList<String>();

    public abstract PizzaBuilder addCheese();
    public abstract PizzaBuilder addSauce();
    public abstract PizzaBuilder addTomatoes();
    public abstract PizzaBuilder addGarlic();
    public abstract PizzaBuilder addOlives();
    public abstract PizzaBuilder addSpinach();
    public abstract PizzaBuilder addPepperoni();
    public abstract PizzaBuilder addSausage();

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.setToppings(toppings);
        return pizza;
    }

}