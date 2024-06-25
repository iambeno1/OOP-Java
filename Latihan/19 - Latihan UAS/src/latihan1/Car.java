package latihan1;
public class Car implements Vehicle {
    private String brand;
    private double seatingCapacity;

    public Car(String brand, double seatingCapacity){
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
    }

    // public Car(){};

    @Override
    public void startEngine(){
        System.out.println(brand + " Car engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println(brand + " Car engine stopped");
    }

    @Override
    public double fuelEfficiency(){
        return 15.0;
    }

    public String getBrand() {
        return brand;
    }

    public double getSeatingCapacity() {
        return seatingCapacity;
    }
}
