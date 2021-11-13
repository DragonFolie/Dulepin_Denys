package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF implements Bean {
    private String name;
    private String value;

    public BeanF() {

        System.out.println("Costructor "+ this.getClass().getSimpleName());
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
