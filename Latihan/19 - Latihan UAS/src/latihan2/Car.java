package latihan2;

public class Car implements Vehicle {

    private String brand;
    private int seatingCapacity;

    public Car(String brand, int seatingCapacity){
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
    }

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

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

}
