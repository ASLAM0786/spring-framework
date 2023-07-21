package com.aslam.learnspringframework;

import com.aslam.learnspringframework.database.BusinessCalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
@ComponentScan("com.aslam.learnspringframework.database")
public class DataBaseConnectionLauncher {
    public static void main(String[] args) {
        try{
            ApplicationContext context =  new AnnotationConfigApplicationContext(DataBaseConnectionLauncher.class);
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
