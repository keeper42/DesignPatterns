package org.example;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Unit test for simple App.
 */
public class AppTest {

    private static Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Autowired
    private PizzaService pizzaService;

    @Test
    public void testInit() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Pizza pizza = context.getBean(Pizza.class);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testBuilder() {
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

}
