package com.epamlab.task1.beansForPart7;

import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(Ordered.LOWEST_PRECEDENCE)
public class SomeBeanA implements SomeInterface{
    @Override
    public String getBean() {
        return "im someBeanA";
    }
}
