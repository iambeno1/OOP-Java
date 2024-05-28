package game;

import user.User;
import java.util.Scanner;

public class Game {
    private User currentUser;
    private Player player;
    private Scanner scanner;

    public Game(User currentUser) {
        this.currentUser = currentUser;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Choose your role:");
        System.out.println("1. Magician");
        System.out.println("2. Fighter");
        System.out.print("Your choice: ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String role = roleChoice == 1 ? "Magician" : "Fighter";
        player = new Player(role);
        boolean playing = true;

        while (playing) {
            System.out.println("1. Open backpack");
            System.out.println("2. Start Adventure");
            System.out.println("3. Use potion");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    player.showBackpack();
                    break;
                case 2:
                    startAdventure();
                    break;
                case 3:
                    player.usePotion();
                    break;
                case 4:
                    playing = false;
                    break;
            }
        }
    }

    private void startAdventure() {
        boolean adventuring = true;
        while (adventuring) {
            System.out.println("1. Go straight");
            System.out.println("2. Move right");
            System.out.println("3. Move left");
            System.out.println("4. Exit Game");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 4) {
                adventuring = false;
                continue;
            }

            if (new java.util.Random().nextBoolean()) {
                Enemy enemy = Utilities.getRandomEnemy();
                System.out.println("Upss! Enemy founded");
                System.out.println("===Enemy Identity======");
                System.out.println("Enemy Name: " + enemy.getName());
                System.out.println("Enemy Blood: " + enemy.getHealth());
                System.out.println("Enemy Attack Power: " + enemy.getAttackPower());
                battle(enemy);
            } else {
                String item = Utilities.getRandomItem();
                System.out.println("You got an item: " + item);
                player.addItem(item);
            }
        }
    }

    private void battle(Enemy enemy) {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Your health: " + player.getHealth());
            System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 2) {
                System.out.println("You ran away from the enemy");
                break;
            }

            double damage = player.getLevel() * 10;
            enemy.reduceHealth(damage);
            System.out.println("You hit the enemy for " + damage + " damage");

            if (enemy.getHealth() > 0) {
                player.reduceHealth(enemy.getAttackPower());
                System.out.println("The enemy hit you for " + enemy.getAttackPower() + " damage");
            } else {
                System.out.println("You defeated the enemy!");
                player.levelUp();
                System.out.println("Levels Up!");
                player.showStatus();
            }
        }
    }
}
