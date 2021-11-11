package com.epam.spring.homework1.pet;


import org.springframework.stereotype.Component;

@Component
public class Cheetah implements Animal{


//    public Cheetah(){
//        System.out.println("Cheetah");
//    }

    @Override
    public String   getName(){
        return "Cheetah";
    }

}
