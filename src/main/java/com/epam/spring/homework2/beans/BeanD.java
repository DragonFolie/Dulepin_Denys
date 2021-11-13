package com.epam.spring.homework2.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanD implements Bean{
    private String name;
    private String value;

    private void customInitMethod(){
        System.out.println("Inside initMethod() " + this.getClass().getSimpleName() );
    }

    private void customDestroyMethod(){
        System.out.println("Inside destroyMethod() " + this.getClass().getSimpleName() );
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }
    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
