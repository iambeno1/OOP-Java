package game;

import java.util.Random;

public class Utilities {
    private static Random random = new Random();

    public static String getRandomItem() {
        String[] items = {"Potion", "Sword", "Shield", "Rice"};
        return items[random.nextInt(items.length)];
    }

    public static Enemy getRandomEnemy() {
        String[] enemyNames = {"Colossal Titan", "Founding Titan", "Armored Titan"};
        double[] enemyHealth = {40.0, 36.0, 50.0};
        double[] enemyAttack = {5.0, 10.0, 7.0};
        int index = random.nextInt(enemyNames.length);
        return new Enemy(enemyNames[index], enemyHealth[index], enemyAttack[index]);
    }
}
