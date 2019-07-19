package com.stackroute;


import com.stackroute.spring.BeanPostProcessorDemo;
import com.stackroute.spring.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        //using application context
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.spring");

        Movie movie = context.getBean("movieObj",Movie.class);
        movie.display();

        BeanPostProcessorDemo beanPostProcessorDemoBean =  (BeanPostProcessorDemo) context.getBean("beanPostProcessorDemo");
    }
}
