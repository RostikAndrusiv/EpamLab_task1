package com.epamlab.task1;

import com.epamlab.task1.beans3.BeanE;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.epamlab.task1.beans2",
        "com.epamlab.task1.beans3"}, excludeFilters={
        @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=BeanE.class)})

public class MyConfig2 {
}
