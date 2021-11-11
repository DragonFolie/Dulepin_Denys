package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Animal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ComponentScan("com.epam.spring.homework1.beans")
@Import(OtherConfig.class)
public class BeansConfig {





}
