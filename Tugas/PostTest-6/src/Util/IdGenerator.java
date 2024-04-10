package Util;

public class IdGenerator {
    private static int counter = 0;

    public static String generateUniqueId() {
        counter++;
        return "ID" + counter;
    }
}
