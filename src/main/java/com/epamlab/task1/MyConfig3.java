package com.epamlab.task1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.epamlab.task1.otherBeans", "com.epamlab.task1.beansForPart6",
        "com.epamlab.task1.beansForPart7", "com.epamlab.task1.beansForPart8"})
public class MyConfig3 {
}
