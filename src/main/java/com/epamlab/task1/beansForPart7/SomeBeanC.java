package com.epamlab.task1.beansForPart7;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SomeBeanC implements SomeInterface{
    @Override
    public String getBean() {
        return "im someBeanС";
    }
}
