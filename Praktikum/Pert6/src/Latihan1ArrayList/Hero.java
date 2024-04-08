package Latihan1ArrayList;
public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("This is " + this.name + " with health " + this.health);
    }

    @Override
    public String toString() {
        return "Hero: " + this.name;
    }
}
