package com.aslam.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Aslam";
    }

    @Bean (name = "Umar")
    public int Age(){
        return 26;
    }

//    @Bean
//    public Person person(){
//        return new Person(name());
//    }

//    @Bean
//    public Person person(String name, int age){
//        return new Person(name,age);
//    }
}
