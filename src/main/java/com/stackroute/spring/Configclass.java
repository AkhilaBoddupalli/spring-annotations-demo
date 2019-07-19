package com.stackroute.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configclass {

//	Movie Beans

    @Bean
    public Movie movieObj (){
        return new Movie(actor());
    }

    @Bean
    public Movie movieObj1 (){
        return new Movie(actorObj());
    }
//actorbeans
    @Bean
    public Actor actorObj (){
        return new Actor("bhanu","female",22);
    }

    @Bean
    public Actor actor (){
        return new Actor("sree","female",23);
    }

}

