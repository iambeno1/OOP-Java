package main;

import game.Game;
import user.User;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, User> users;

    public static void main(String[] args) {
        users = User.loadUsers(); // Load existing users from file
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    signUp(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            Game game = new Game(user);
            game.start();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void signUp(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already taken. Please choose another.");
        } else {
            User newUser = new User(username, password);
            User.saveUser(newUser); // Save the new user to file
            users.put(username, newUser);
            System.out.println("User registered successfully!");
        }
    }
}
