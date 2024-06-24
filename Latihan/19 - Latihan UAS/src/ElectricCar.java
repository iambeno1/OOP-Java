public class ElectricCar extends Car {
    private double baterryCapacity;

    public ElectricCar(String brand, double seatingCapacity, double baterryCapacity){
        super(brand, seatingCapacity);
        this.baterryCapacity = baterryCapacity;
    }

    @Override
    public void startEngine(){
        System.out.println(getBrand() + " Electric car powered on");
    }

    @Override
    public double fuelEfficiency(){
        return 0.0;
    }

    public double getBaterryCapacity() {
        return baterryCapacity;
    }
    
}
