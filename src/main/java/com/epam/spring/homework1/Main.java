package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.AllPets;
import com.epam.spring.homework1.pet.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {



    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

//        BeansConfig bean = context.getBean(BeansConfig.class);

        AllPets pet = context.getBean(AllPets.class);
        pet.printPets();







    }
}
