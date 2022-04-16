package org.example.decorator;

import org.example.BasicPizza;

public class Cheese extends ToppingDecorator {

	public Cheese(BasicPizza pizza) {
		this.pizza = pizza;
	}
 
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}
 
	@Override
	public double cost() {
		return pizza.cost();
	}

}
