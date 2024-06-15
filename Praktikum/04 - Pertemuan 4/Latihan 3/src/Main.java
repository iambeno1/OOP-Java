public class Main {
    public static void main(String[] args) {
        // Membuat objek Weapon dan Armor untuk player 1
        Weapon weapon1 = new Weapon(10, "Sword");
        Armor armor1 = new Armor(5, "Chainmail");
        Player player1 = new Player("Player 1", 100, 1, weapon1, armor1);

        // Membuat objek Weapon dan Armor untuk player 2
        Weapon weapon2 = new Weapon(8, "Axe");
        Armor armor2 = new Armor(8, "Plate");
        Player player2 = new Player("Player 2", 100, 1, weapon2, armor2);

        // Player 1 menyerang Player 2
        player1.attack(player2);

        // Player 2 menyerang Player 1
        player2.attack(player1);

        // Player 1 menyerang Player 2 lagi
        player1.attack(player2);

        // Player 2 menyerang Player 1 lagi
        player2.attack(player1);

        // Menampilkan status player setelah serangan
        System.out.println("Player 1 Status:");
        player1.display();
        System.out.println("Player 2 Status:");
        player2.display();
    }
}
