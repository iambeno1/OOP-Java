public class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return strength * 10 + health;
    }

    public int getDefencePower() {
        return strength * 2;
    }
}
