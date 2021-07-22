package com.epamlab.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig1.class);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfig2.class);
        AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(MyConfig3.class);

        System.out.println("------context1------" + System.lineSeparator());
        for (String beanDefinitionName :
                context1.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("------context2------" + System.lineSeparator());
        for (String beanDefinitionName :
                context2.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("------context3------" + System.lineSeparator());
        for (String beanDefinitionName :
                context3.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        context1.close();
        context2.close();
        context3.close();
    }
}
