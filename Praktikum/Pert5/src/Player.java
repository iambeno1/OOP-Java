import java.util.ArrayList;

public class Player {
    private static int numbOfPlayer = 0;
    private static ArrayList<String> nameList = new ArrayList<>();
    private String name;

    Player(String name) {
        this.name = name;
        numbOfPlayer++;
        nameList.add(name);
    }

    // Getter untuk numbOfPlayer
    public static int getNumbOfPlayer() {
        return numbOfPlayer;
    }

    // Getter untuk nameList
    public static ArrayList<String> getNameList() {
        return nameList;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }
}
