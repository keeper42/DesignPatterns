package org.example;

import lombok.Data;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
@Data
public abstract class BasicPizza {

    public String description = "Basic Pizza";

    public abstract double cost();

}
