package app.com;

public abstract class ElectronicDevice implements ISwitchable {
    protected String brand;
    protected String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();
}

