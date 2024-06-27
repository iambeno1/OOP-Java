package app.com;

public class Television extends ElectronicDevice {
    private int screenSize;

    public Television(String brand, String model, int screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " " + model + " TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " " + model + " TV is now OFF.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Television [Brand: " + brand + ", Model: " + model + ", Screen Size: " + screenSize + " inches]");
    }
}

