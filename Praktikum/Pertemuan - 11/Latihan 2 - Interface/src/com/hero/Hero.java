package com.hero;

public class Hero implements IAttack {
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // memakai kelas ini untuk mengimplementasikan method attack
    public void attack(Hero enemy){
        System.out.println(name + " attacks " + enemy.name);
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Health : " + health);
    }
}
