package org.example.factory;

import org.example.interfaces.PizzaFactory;
import org.example.materials.Cheese;
import org.example.materials.Clams;
import org.example.materials.Dough;
import org.example.materials.Pepperoni;
import org.example.materials.Sauce;
import org.example.materials.Veggies;
import org.example.materials.impl.BlackOlives;
import org.example.materials.impl.Eggplant;
import org.example.materials.impl.FrozenClams;
import org.example.materials.impl.MozzarellaCheese;
import org.example.materials.impl.PlumTomatoSauce;
import org.example.materials.impl.SlicedPepperoni;
import org.example.materials.impl.Spinach;
import org.example.materials.impl.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
