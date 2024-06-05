public class Main {
    public static void main(String[] args) throws Exception {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.addUser(new User("user1", "pass1"));
        loginSystem.addUser(new User("user2", "pass2"));

        String username = "user1";
        String password = "wrongpass"; // sengaja salah memasukkan kata sandi untuk memicu pengecualian

        try {
            // Mencoba masuk
            loginSystem.login(username, password);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Login failed: " + e.getMessage());
        } finally{
            System.out.println("Login attempt finished.");
        }

        // Multiple try-catch block
        try{
            loginSystem.login("user3", "pass3"); // username not found
        } catch(LoginException e){
            System.out.println("Login failed: " + e.getMessage());
        } finally{
            System.out.println("Login attempt finished.");
        }

        try {
            loginSystem.login("user1", "password1"); // Successful login
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        } finally {
            System.out.println("Login attempt finished.");
        }


    }
}
