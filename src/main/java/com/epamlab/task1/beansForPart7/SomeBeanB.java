package com.epamlab.task1.beansForPart7;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class SomeBeanB implements SomeInterface{
    @Override
    public String getBean() {
        return "im someBeanB";
    }
}
