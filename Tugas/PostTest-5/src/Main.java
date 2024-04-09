public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Marni");
        Player player2 = new Player("Issabela");

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
    }
}
