package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{


    public Cat(){

//        System.out.println("Cat");

    }

    @Override
    public String  getName(){
        return "Cat";
    }


}
