package com.aslam.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Game Started!");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
