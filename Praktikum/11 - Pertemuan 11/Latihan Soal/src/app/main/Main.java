package app.main;

import app.com.Refrigerator;
import app.com.Television;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", "QLED", 55);
        Refrigerator fridge = new Refrigerator("LG", "InstaView", 600);

        tv.displayInfo();
        tv.turnOn();
        tv.turnOff();

        fridge.displayInfo();
        fridge.turnOn();
        fridge.turnOff();
    }
}
