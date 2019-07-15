package com.stackroute.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;



    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void display()
    {
        System.out.println("Actor Name: "+ actor.getName()+" Gender: "+ actor.getGender()+" Age: "+ actor.getAge() );
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext");
    }

}
