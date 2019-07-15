package com.stackroute.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configclass {

//	Movie Beans


    @Bean
    public Movie movieObj (){
        return new Movie();
    }



    @Bean
    public Actor actorObj (){
        return new Actor("bhanu","female",39);
    }

    @Bean
    public Actor actor (){
        return new Actor("jaya","female",46);
    }

}

