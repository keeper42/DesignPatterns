package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 * @description builder
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Pizza {

    private static Logger logger = LoggerFactory.getLogger(Pizza.class);

    protected String name;

    protected List<String> toppings;

    public void prepare() {
        for (String topping : toppings) {
            logger.info(" {}", topping);
        }
    }

    @MethodLog()
    public void bake() {}

    @MethodLog
    public void cut() {}

    @MethodLog
    public void box() {}

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (String topping : toppings) {
            display.append(topping + ", ");
        }
        return display.toString();
    }

}
