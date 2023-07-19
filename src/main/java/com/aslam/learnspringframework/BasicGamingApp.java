package com.aslam.learnspringframework;

import com.aslam.learnspringframework.game.*;

public class BasicGamingApp {
    public static void main(String[] args) {
        System.out.println("Hello");
        //MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        //PacmanGame game = new PacmanGame();
        GamingConsole game = new PacmanGame();//new SuperContraGame();//new MarioGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
