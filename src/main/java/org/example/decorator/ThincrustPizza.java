package org.example.decorator;

import org.example.BasicPizza;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
public class ThincrustPizza extends BasicPizza {
  
	public ThincrustPizza() {
		description = "Thin crust pizza, with tomato sauce";
	}
  
	@Override
	public double cost() {
		return 8.8;
	}

}

