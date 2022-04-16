package org.example.decorator;

import org.example.BasicPizza;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
public class Olives extends ToppingDecorator {
	public Olives(BasicPizza pizza) {
		this.pizza = pizza;
	}
 
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}
 
	@Override
	public double cost() {
		return pizza.cost() + .20;
	}

}
