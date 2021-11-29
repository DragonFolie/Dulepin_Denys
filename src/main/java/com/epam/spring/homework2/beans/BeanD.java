package com.epam.spring.homework2.beans;

<<<<<<< Updated upstream
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanD implements Bean{
    private String name;
    private String value;

=======
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Order(1)
public class BeanD implements Bean{


    @Value("${name}")
    private String name;
    @Value("${value}")
    private String value;


    @PostConstruct
>>>>>>> Stashed changes
    private void customInitMethod(){
        System.out.println("Inside initMethod() " + this.getClass().getSimpleName() );
    }

<<<<<<< Updated upstream
=======

    @PreDestroy
>>>>>>> Stashed changes
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
