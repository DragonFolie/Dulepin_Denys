package com.epam.spring.homework2.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanC implements Bean{
    private String name;
    private String value;

    private void customInitMethod(){
        System.out.println("Inside initMethod() " + this.getClass().getSimpleName() );
    }

    private void customDestroyMethod(){
        System.out.println("Inside destroyMethod() " + this.getClass().getSimpleName() );
    }


    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }
}
