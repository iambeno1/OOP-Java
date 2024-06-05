import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();

        // Menambahkan beberapa pengguna untuk contoh
        loginSystem.addUser(new User("user1", "password1"));
        loginSystem.addUser(new User("user2", "password2"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            loginSystem.login(username, password);
        } catch (LoginException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}
