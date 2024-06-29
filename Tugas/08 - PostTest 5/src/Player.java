public class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;
    private Armor armor;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.level = 1;
        this.totalDamage = 0;
        this.isAlive = true;
        this.armor = new Armor("Basic Armor", 5, 20);
        this.weapon = new Weapon("Basic Sword", 10);
    }

    public void display() {
        System.out.println("Player\t\t: " + name);
        System.out.println("Level\t\t: " + level);
        System.out.println("Health\t\t: " + (baseHealth + level * incrementHealth + armor.getAddHealth()) + "/" + (baseHealth + level * incrementHealth + armor.getAddHealth()));
        System.out.println("Attack\t\t: " + (baseAttack + level * incrementAttack + weapon.getAttack()));
        System.out.println("Alive\t\t: " + isAlive);
        System.out.println();
    }

    public void attack(Player target) {
        int damage = baseAttack + level * incrementAttack;
        System.out.println(name + " is attacking " + target.getName() + " with " + damage);
        target.defence(damage);
        levelUp();
    }

    public void defence(int damage) {
        int defencePower = armor.getDefencePower();
        int deltaDamage = Math.max(0, damage - defencePower);
        totalDamage += deltaDamage;
        int currentHealth = baseHealth + level * incrementHealth + armor.getAddHealth() - totalDamage;
        if (currentHealth <= 0) {
            isAlive = false;
            totalDamage = currentHealth + totalDamage;
        }
        System.out.println(name + " defence power = " + defencePower);
        System.out.println("Damage earned = " + deltaDamage);
        display();
    }

    public void levelUp() {
        level++;
    }

    public String getName() {
        return name;
    }
}
