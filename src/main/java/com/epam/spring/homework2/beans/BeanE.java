package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements Bean {
    private String name;
    private String value;


    private ApplicationContext context;

    @Autowired
    public void context(ApplicationContext context) { this.context = context; }


    @PostConstruct
    public void postConstrunct(){

        System.out.println("PostConstruct "+ this.getClass().getSimpleName());

    }

    @PreDestroy
    public void preDestroy(){

        System.out.println("preDestroy "+ this.getClass().getSimpleName());

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
