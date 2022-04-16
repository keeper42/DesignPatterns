package org.example;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
@Data
@Service
public class PizzaService {

    private Pizza pizza;

    PizzaService() {
        pizza = new Pizza();
    }



}
