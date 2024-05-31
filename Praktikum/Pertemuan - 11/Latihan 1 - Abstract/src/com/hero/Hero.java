package com.hero;

public abstract class Hero {
    private String name;
    private int level;

    public Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println("Aku adalah " + name);
        System.out.println("Level " + level);
    }

    // Abstract method
    public abstract void levelUp();

    // Setter
    public void setLevel(int deltaLevel) {
        this.level += deltaLevel;
    }
}
