package org.example.factory.type;

import lombok.AllArgsConstructor;
import org.example.factory.Pizza;
import org.example.interfaces.PizzaFactory;

@AllArgsConstructor
public class ClamPizza extends Pizza {

	PizzaFactory factory;
 
	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		clam = factory.createClam();
	}

}
