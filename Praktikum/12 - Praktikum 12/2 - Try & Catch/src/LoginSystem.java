import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user){
        users.put(user.getUsername(), user);
    }

    public void login(String username, String password) throws LoginException{
        User user = users.get(username);
        if(user == null){
            throw new LoginException("Username not found.");
        }

        if(!user.getPassword().equals(password)){
            throw new LoginException("Incoret password.");
        }

        System.out.println("Berhasil login.");
    }
}


