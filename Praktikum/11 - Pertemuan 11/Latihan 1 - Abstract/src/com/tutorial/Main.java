package com.tutorial;

import com.hero.HeroAgility;
import com.hero.HeroIntel;
import com.hero.HeroStrength;;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dar kelas non-abstak
        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();

        // Membuat objek dari kelas abstrac
        // Hero hero3 = new Hero("Mario");
        // hero3.display();

        hero1.levelUp();
        hero2.levelUp();
        hero1.display();
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Ucup");
        hero3.levelUp();
        hero3.display();
    }
}
