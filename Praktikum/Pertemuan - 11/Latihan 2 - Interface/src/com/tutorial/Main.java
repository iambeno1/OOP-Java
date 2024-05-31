package com.tutorial;

import com.hero.Hero;;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Otong", 100);
        Hero hero2 = new Hero("Ucup", 20);

        hero1.attack(hero2);
    }
}
