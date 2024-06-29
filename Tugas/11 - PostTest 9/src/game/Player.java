package game;

import java.util.ArrayList;

public class Player {
    private String role;
    private double health;
    private double mana;
    private ArrayList<String> backpack;
    private int level;

    public Player(String role) {
        this.role = role;
        this.health = role.equals("Magician") ? 100 : 150;
        this.mana = role.equals("Magician") ? 200 : 50;
        this.backpack = new ArrayList<>();
        this.level = 1;
    }

    public void usePotion() {
        if (backpack.contains("Potion")) {
            health += 50;
            mana += 10;
            backpack.remove("Potion");
            System.out.println("Potion used successfully!");
        } else {
            System.out.println("No potions available!");
        }
    }

    public void addItem(String item) {
        backpack.add(item);
    }

    public void showStatus() {
        System.out.println("Your health: " + health);
        System.out.println("Your mana: " + mana);
        System.out.println("Your level: " + level);
    }

    public void showBackpack() {
        System.out.println("Items in Backpack: " + backpack);
    }

    public String getRole() {
        return role;
    }

    public double getHealth() {
        return health;
    }

    public void reduceHealth(double damage) {
        this.health -= damage;
    }

    public double getMana() {
        return mana;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        this.level++;
        this.health += 50;
        this.mana += 20;
    }
}
