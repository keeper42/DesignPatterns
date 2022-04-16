package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.aop.AopConfig;
import org.example.builder.MeatLoversPizzaBuilder;
import org.example.builder.PizzaBuilder;
import org.example.builder.VeggieLoversPizzaBuilder;
import org.example.decorator.Cheese;
import org.example.decorator.Olives;
import org.example.decorator.ThincrustPizza;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MainTest {

    private static Logger logger = LoggerFactory.getLogger(MainTest.class);

    @Test
    public void init() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Pizza pizza = context.getBean(Pizza.class);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void builder() {
        PizzaBuilder veggieBuilder = new VeggieLoversPizzaBuilder();
        // build a veggiePizza.
        Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSausage().build();
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
        logger.info(veggie.toString());

        PizzaBuilder meatBuilder = new MeatLoversPizzaBuilder();
        // build a meat lovers Pizza
        Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addSausage().addPepperoni().build();
        meat.prepare();
        meat.bake();
        meat.cut();
        meat.box();
        logger.info(meat.toString());
    }

    @Test
    public void decorator() {
        ThincrustPizza pizza = new ThincrustPizza();
        Cheese cheese = new Cheese(pizza);
        Olives olives = new Olives(cheese);
        System.out.println(olives.getDescription() + " " + olives.cost());
    }

}
