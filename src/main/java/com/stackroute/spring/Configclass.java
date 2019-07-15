package com.stackroute.spring;

import com.stackroute.spring.Actor;
import com.stackroute.spring.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configclass {

    @Bean
    public Movie movieBean() {
        Movie movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }

    @Bean
    public Actor actorBean() {
        return new Actor();
    }

}