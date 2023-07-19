package com.aslam.learnspringframework;

import com.aslam.learnspringframework.game.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicGamingApp {
    public static void main(String[] args) {
//        try ( ApplicationContext context  = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
        try {
            ApplicationContext context  = new AnnotationConfigApplicationContext(GamingConfiguration.class);
            context.getBean(GameRunner.class).run();
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
//        System.out.println("Hello");
//        //MarioGame game = new MarioGame();
//        //SuperContraGame game = new SuperContraGame();
//        //PacmanGame game = new PacmanGame();
//        GamingConsole game = new PacmanGame();//new SuperContraGame();//new MarioGame();
//        //Object creation
//        GameRunner gameRunner = new GameRunner(game);
//        //object creation + Wiring of dependencies
//        gameRunner.run();
    }
}
