package com.stackroute;

import com.stackroute.spring.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main( String[] args )
    {
        //using application context
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.spring");
        Movie movie1 = context.getBean("movieBean",Movie.class);
        movie1.display();

        //bean factory
        BeanFactory factory = new AnnotationConfigApplicationContext("com.stackroute.spring");
        Movie movie2 = factory.getBean("movieBean",Movie.class);
        movie2.display();

//        //beandefinition reader and bean definition registry
//        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
//        BeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/stackroute/spring/Configclass"));
//        Movie movie3=context.getBean("movieBean",Movie.class);
//        movie3.display();


    }

}
