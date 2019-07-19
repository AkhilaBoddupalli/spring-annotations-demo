package com.stackroute;

import com.stackroute.spring.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        //using application context
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.spring");

        Movie movie1 = context.getBean("movieObj1",Movie.class);
        movie1.display();

        Movie movie2 = context.getBean("movieObj2",Movie.class);
        movie2.display();

        Movie movie3 = context.getBean("movieObj3",Movie.class);
        movie3.display();

        Movie movie4 = context.getBean("movieObj3",Movie.class);

        //comparing two beans

        System.out.println(movie3 == movie4);

        Movie movie5 = (Movie) context.getBean("movieObject");
        movie5.display();
    }

}