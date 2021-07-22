package com.epamlab.task1.beansForPart8;

import com.epamlab.task1.beansForPart7.SomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LastOne {
    @Autowired
    @Qualifier("someBeanA")
    private SomeInterface instance1;
    @Autowired
    @Qualifier("someBeanB")
    private SomeInterface instance2;
    private SomeInterface instance3;
    private SomeInterface instance4;


    public LastOne(@Qualifier("someBeanC") SomeInterface instance3) {
        this.instance3 = instance3;
    }

    @Autowired
    @Qualifier("someBeanD")
    public void setInstance4(SomeInterface instance4) {
        this.instance4 = instance4;
    }
}
