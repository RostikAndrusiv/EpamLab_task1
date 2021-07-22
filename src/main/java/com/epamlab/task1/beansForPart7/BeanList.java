package com.epamlab.task1.beansForPart7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BeanList {
    @Autowired
    private List<SomeInterface> beanList;

    public void printBeanList(){
        for (SomeInterface bean:
             beanList) {
            System.out.println(bean.getBean());
        }
    }
}
