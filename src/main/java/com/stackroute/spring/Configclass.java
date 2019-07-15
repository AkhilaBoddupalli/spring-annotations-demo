package com.stackroute.spring;

import com.stackroute.spring.Actor;
import com.stackroute.spring.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configclass {

    //	Movie Beans
    @Bean(name = {"movieObj1", "movieObject"})
    public Movie movieBean (){
        Movie movie = new Movie(actorObj1());
        return movie;
    }

    @Bean
    public Movie movieObj2 (){
        Movie movie = new Movie(actorObj2());
        return movie;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieObj3 (){
        Movie movie = new Movie(actorObj3());
        return movie;
    }

    //	Actor Beans
    @Bean
    public Actor actorObj1 (){
        return new Actor("akhila","female",22);
    }

    @Bean
    public Actor actorObj2 (){
        return new Actor("bhanu","female",16);
    }

    @Bean
    public Actor actorObj3 (){
        return new Actor("Shastra","female",20);
    }



}