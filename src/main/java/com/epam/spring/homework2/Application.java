package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        String[] allBeanNames = context.getBeanDefinitionNames();

        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }


        BeanB b =context.getBean(BeanB.class);
        System.out.println("Properties name = " + b.getName() );
        System.out.println("Properties name = " +b.getValue());



    }

}
