package org.example.interfaces;

import org.example.materials.Cheese;
import org.example.materials.Clams;
import org.example.materials.Dough;
import org.example.materials.Pepperoni;
import org.example.materials.Sauce;
import org.example.materials.Veggies;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
public interface PizzaFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
