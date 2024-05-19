package com.tutorial;

public class HeroStrength extends Hero{
    // this.name akan mengakses atribute name kalau ada di kelas ini
    // jika tidak ada maka akan mengakses atribute name dari superclass

    // super.name akan selalu mengakses atribut superclass

    String name  = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini adalah di sub class");
    }
}
