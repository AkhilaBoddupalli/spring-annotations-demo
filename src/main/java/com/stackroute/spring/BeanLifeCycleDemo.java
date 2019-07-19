package com.stackroute.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


    public class BeanLifeCycleDemo implements DisposableBean, InitializingBean {

        //default methods afterPropertiesSet and destroy
        @Override
        public void afterPropertiesSet() throws Exception
        {
            System.out.println("Inside afterPropertiesSet method");
        }
        @Override
        public void destroy() throws Exception
        {
            System.out.println("Inside destroy method");
        }

        //custom methods(user defined)
        public void customInit()
        {
            System.out.println("Inside customInit method");
        }

        public void customDestroy()
        {
            System.out.println("Inside customDestroy method");
        }
    }


