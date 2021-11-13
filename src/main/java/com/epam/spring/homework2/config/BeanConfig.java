package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.epam.spring.homework2.beans")
@PropertySource("classpath:myApp.properties")
@Import(ChildBeanConfig.class)
public class BeanConfig {



    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanC beanC(){
        return new BeanC();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanD beanD(){
        return new BeanD();
    }

}
