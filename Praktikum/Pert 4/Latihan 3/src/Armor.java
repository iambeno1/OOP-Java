public class Armor {
    public double defencePower;
    public String name;

    public Armor(double defencePower, String name) {
        this.defencePower = defencePower;
        this.name = name;
    }

    public void display() {
        System.out.println("Armor: " + name);
        System.out.println("Defence Power: " + defencePower);
    }
}
