package com.stackroute.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configclass {

//	Movie Beans

    @Bean
    public Movie movieObj (){
        return new Movie(actorObj());
    }

    @Bean
    public Actor actorObj (){
        return new Actor("sivakarthikeyan","male",30);
    }

    @Bean(initMethod = "customInit", destroyMethod = "destroy")
    public BeanLifeCycleDemo beanlifecycle() {
        return new BeanLifeCycleDemo();
    }

}