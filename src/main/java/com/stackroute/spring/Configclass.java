package com.stackroute.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configclass {

//	creating Bean objects

    @Bean
    public Movie movieObj (){
        return new Movie(actorObj());
    }



    @Bean
    public Actor actorObj (){
        return new Actor("akhila","female",30);
    }


    @Bean
    public BeanPostProcessorDemo beanPostProcessorDemo(){
        return new BeanPostProcessorDemo();
    }

}