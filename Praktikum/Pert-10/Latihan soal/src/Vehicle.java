public class Vehicle {
    String brand;
    String model;
    String color;
    int year;

    Vehicle(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}
