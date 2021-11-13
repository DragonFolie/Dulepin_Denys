package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("BeanFactoryPostProcessor")
public class BeanFactoryPostProcesso implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {


        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("beanB");
        beanDefinition.setInitMethodName("changedInitMethod");

    }
}
