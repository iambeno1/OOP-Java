public class Car extends Vehicle {
    int numberOfSeats;

    Car(String brand, String model, String color, int year, int numberOfSeats) {
        super(brand, model, color, year);
        this.numberOfSeats = numberOfSeats;
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }
}
