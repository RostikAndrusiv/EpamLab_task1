package com.epamlab.task1.beansForPart6;

import com.epamlab.task1.otherBeans.OtherBeanA;
import com.epamlab.task1.otherBeans.OtherBeanB;
import com.epamlab.task1.otherBeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBeanA {
    @Autowired
    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;
    private OtherBeanC otherBeanC;

    @Autowired
    public MyBeanA(@Qualifier("otherBeanB") OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    @Qualifier("otherBeanC")
    @Autowired
    public void setBeanC(OtherBeanC otherBeanC) {
        this.otherBeanC = otherBeanC;
    }
}
