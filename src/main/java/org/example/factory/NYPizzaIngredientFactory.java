package org.example.factory;

import org.example.PizzaFactory;
import org.example.materials.Cheese;
import org.example.materials.Clams;
import org.example.materials.Dough;
import org.example.materials.Pepperoni;
import org.example.materials.Sauce;
import org.example.materials.Veggies;
import org.example.materials.impl.FreshClams;
import org.example.materials.impl.Garlic;
import org.example.materials.impl.MarinaraSauce;
import org.example.materials.impl.Mushroom;
import org.example.materials.impl.Onion;
import org.example.materials.impl.RedPepper;
import org.example.materials.impl.ReggianoCheese;
import org.example.materials.impl.SlicedPepperoni;
import org.example.materials.impl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
