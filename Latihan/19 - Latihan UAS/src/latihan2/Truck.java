package latihan2;

public class Truck implements Vehicle {
    
    private String brand;
    private double loadCapacity;

    public Truck(String brand, double loadCapacity){
        this.brand = brand;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startEngine(){
        System.out.println(brand + " Truck engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println(brand + " Truck engine stopped");
    }

    @Override
    public double fuelEfficiency(){
        return 10.0;
    }

    public String getBrand() {
        return brand;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

}
