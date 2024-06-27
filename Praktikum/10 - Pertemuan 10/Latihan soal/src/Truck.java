public class Truck extends Vehicle {
    double loadCapacity;

    Truck(String brand, String model, String color, int year, double loadCapacity) {
        super(brand, model, color, year);
        this.loadCapacity = loadCapacity;
    }

    double getLoadCapacity() {
        return loadCapacity;
    }
}