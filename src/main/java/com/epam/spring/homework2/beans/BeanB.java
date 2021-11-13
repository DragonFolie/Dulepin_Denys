package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("beanB")
@Order(2)
public class BeanB implements Bean{

    @Value("${name}")
    private String name;
    @Value("${value}")
    private String value;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }

    private void customInitMethod(){
        System.out.println("initMethod()  " + this.getClass().getSimpleName() );
    }

    private void customDestroyMethod(){
        System.out.println("destroyMethod()   " + this.getClass().getSimpleName() );
    }

    public void changedInitMethod(){
        System.out.println("changedInitMethod()   " + this.getClass().getSimpleName() );
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }




}
