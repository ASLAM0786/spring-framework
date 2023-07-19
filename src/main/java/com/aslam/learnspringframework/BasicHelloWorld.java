package com.aslam.learnspringframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicHelloWorld {

    public static void main(String[] args) {
        //1-Launch a spring context
        ApplicationContext context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2- Configure things which we want to manage -
        //HelloWorldConfiguration - @Configuration
        // name @Bean

        //3. Retrieving bean managed by spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("Umar"));

//        System.out.println(context.getBean(Address.class));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
