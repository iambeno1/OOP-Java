package game;

public class Enemy {
    private String name;
    private double health;
    private double attackPower;

    public Enemy(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void reduceHealth(double damage) {
        this.health -= damage;
    }

    public double getAttackPower() {
        return attackPower;
    }
}
