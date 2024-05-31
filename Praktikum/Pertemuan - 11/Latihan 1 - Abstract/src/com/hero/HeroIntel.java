package com.hero;

public class HeroIntel extends Hero {
    public HeroIntel(String name){
        super(name);
    }

    public void levelUp(){
        this.setLevel(1);
    }
}
