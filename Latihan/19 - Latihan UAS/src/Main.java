import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Toyota", 6));
        vehicles.add(new Truck("Volvo", 10000));
        vehicles.add(new Motorcycle("Honda", false));
        vehicles.add(new ElectricCar("Tesla", 5, 100));

        for(Vehicle vehicle : vehicles){
            vehicle.startEngine();
            System.out.println("Feul Efficiency " + vehicle.fuelEfficiency() + " km/1");
            vehicle.stopEngine();
            System.out.println();

            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                System.out.println("Ini adalah mobil dengan kapasitas tempat duduk : " + car.getSeatingCapacity());
            }

            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Ini adalah Truk dengan kapasitas muatan : " + truck.getLoadCapacity());
            }

            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Ini adalah sepeda motor, memiliki sespan " + motorcycle.hasSideCar());
            }

            if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                System.out.println("Ini adalah mobil listrik dengan kapasitas baterai : " + electricCar.getBaterryCapacity());
            }
            System.out.println("=======================================");
        }
    }
}
