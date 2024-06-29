package latihan2;

public class ElectricCar extends Car {

    private double batteryCapacity;

    public ElectricCar(String brand, int seatingCapacity, double baterryCapacity){
        super(brand, seatingCapacity);
        this.batteryCapacity = baterryCapacity;
    }

    @Override
    public void startEngine(){
        System.out.println(getBrand() + " Electric car engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println(getBrand() + " Electric car engine stopped");
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    
}
