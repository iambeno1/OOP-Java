package com.data;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type: " + this.type);
    }

    void showOff() {
        System.out.printf("Saya hero Agility");
    }
}
