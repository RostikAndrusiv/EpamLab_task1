package com.epamlab.task1.beansForPart7;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SomeBeanD implements SomeInterface{

    @Override
    public String getBean() {
        return "im someBeanD";
    }
}
