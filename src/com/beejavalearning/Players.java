package com.beejavalearning;

public class Players {
    final int initialLive = 3;
    private String name;
    private int lives;
    // CONSTRUCTOR
    public Players(String name){
        this.name = name;
        this.lives = initialLive;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int newLives) {
        this.lives = newLives;
    }
}
