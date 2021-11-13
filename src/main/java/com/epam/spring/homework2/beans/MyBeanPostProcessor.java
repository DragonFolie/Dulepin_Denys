package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//
        if (bean instanceof Bean){

            if( ((Bean) bean).getName() != null){

                System.out.println(beanName+ " postProcessBeforeInitialization -->   " +((Bean) bean).getName() + " != Null ");

            }

            if( ((Bean) bean).getName() == null){

                System.out.println(beanName+ " postProcessBeforeInitialization -->   " + ((Bean) bean).getName() + " == Null ");

            }

        }






        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
