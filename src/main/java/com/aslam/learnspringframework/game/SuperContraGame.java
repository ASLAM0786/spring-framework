package com.aslam.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Move Up SuperContraGame!");
    }

    public void down() {
        System.out.println("Move Down SuperContraGame!");
    }

    public void left() {
        System.out.println("Move Left SuperContraGame!");
    }

    public void right() {
        System.out.println("Move Right SuperContraGame!");
    }
}