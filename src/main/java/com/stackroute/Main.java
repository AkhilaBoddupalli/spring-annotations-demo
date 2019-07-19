package com.stackroute;

import com.stackroute.spring.BeanLifeCycleDemo;
import com.stackroute.spring.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        //using application context
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.spring");
        BeanLifeCycleDemo beanLifecycleDemoBean =  (BeanLifeCycleDemo) context.getBean("beanlifecycle");
    }

}
