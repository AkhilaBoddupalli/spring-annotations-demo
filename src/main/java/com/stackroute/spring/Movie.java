package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;


    public class Movie {

        //	@Autowired
        private Actor actor;

        public Movie() {
        }
        public Movie(Actor actor) {
            this.actor = actor;

        }

        @Autowired
        public void setActor(Actor actor) {
            this.actor = actor;


        }

        public void display()
        {
            System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
        }
    }
