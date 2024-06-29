package latihan2;

public class Motorcycle implements Vehicle {

    private String brand;
    private boolean hasSideCar;

    public Motorcycle(String brand, boolean hasSideCar){
        this.brand = brand;
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void startEngine(){
        System.out.println(brand + " Motorcycle engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println(brand + " Motorcycle engine stopped");
    }

    @Override
    public double fuelEfficiency(){
        return 50.0;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getHasSideCar(){
        return hasSideCar;
    }
    
}
