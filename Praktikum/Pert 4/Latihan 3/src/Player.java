public class Player {
    public String name;
    public double health;
    public int level;
    public Weapon weapon;
    public Armor armor;

    public Player(String name, double health, int level, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack(Player opponent) {
        System.out.println(this.name + " is attacking " + opponent.name);
        double damage = Math.max(0, this.weapon.attackPower - opponent.armor.defencePower);
        opponent.health -= damage;
        System.out.println(opponent.name + " takes " + damage + " damage");
    }

    public void defend() {
        System.out.println(this.name + " is defending");
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equips " + weapon.name);
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(this.name + " equips " + armor.name);
    }

    public void display() {
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
        System.out.println("Weapon: " + weapon.name);
        System.out.println("Armor: " + armor.name);
    }
}
