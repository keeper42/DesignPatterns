package org.example.factory.type;

import lombok.AllArgsConstructor;
import org.example.PizzaFactory;
import org.example.factory.Pizza;

@AllArgsConstructor
public class VeggiePizza extends Pizza {

	PizzaFactory factory;

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		veggies = factory.createVeggies();
	}

}
