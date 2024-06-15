public class Weapon {
    public double attackPower;
    public String name;

    public Weapon(double attackPower, String name) {
        this.attackPower = attackPower;
        this.name = name;
    }

    public void display() {
        System.out.println("Weapon: " + name);
        System.out.println("Attack Power: " + attackPower);
    }
}
