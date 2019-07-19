package com.stackroute.spring;




public class Movie {

    //actor object in movie class
    private Actor actorObj;

    public Movie() {
    }

    public Movie(Actor actorObj) {
        this.actorObj = actorObj;
    }

    public Actor getActorObj() {
        return actorObj;
    }

    public void setActorObj(Actor actorObj) {
        this.actorObj = actorObj;
    }

    public void display()
    {
        System.out.println("Actor Name: "+ actorObj.getName()+" Gender: "+ actorObj.getGender()+" Age: "+ actorObj.getAge() );
    }
}