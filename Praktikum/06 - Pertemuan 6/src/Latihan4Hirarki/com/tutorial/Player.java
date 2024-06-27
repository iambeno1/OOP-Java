package Latihan4Hirarki.com.tutorial;

import Latihan4Hirarki.com.terminal.Console;

public class Player {
    
    // visibility default class Player
    private String name;

    Player(String name) { 
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    void show(){
        // System.out.println("Player name+this.name");
        Console.log("Menggunakan Console"); 
        Console.log("Player name :" + this.name);
    }
}
