package latihan2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Lamborghini", 4));
        vehicles.add(new Truck("Volvo", 1000));
        vehicles.add(new Motorcycle("Honda", false));
        vehicles.add(new ElectricCar("Tesla", 4, 100));

        for(Vehicle vehicle : vehicles){
            vehicle.startEngine();
            System.out.println("Fuel efficiency " + vehicle.fuelEfficiency() + " km/h");
            vehicle.stopEngine();
            System.out.println();

            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                System.out.println("Ini adalah mobil mobil dengan kapasitas tempat duduk : " + car.getSeatingCapacity());
            }

            if(vehicle instanceof Truck){
                Truck truck = (Truck) vehicle;
                System.out.println("Ini adalah Truk dengan kapasitas muatan : " + truck.getLoadCapacity());
            }

            if(vehicle instanceof Motorcycle){
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Ini adalah sepeda motor dengan hasSideCar" + motorcycle.getHasSideCar());
            }

            if(vehicle instanceof ElectricCar){
                ElectricCar electricCar = (ElectricCar) vehicle;
                System.out.println("Ini adalah mobil llistrik dengan kapasitas battery : " + electricCar.getBatteryCapacity());
            }
            System.out.println("======================================\n");
        }
    }
}
