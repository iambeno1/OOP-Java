public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Honda", "Civic", "silver", 2019, 5);
        vehicles[1] = new Car("Chevrolet", "Malibu", "red", 2021, 5);
        vehicles[2] = new Truck("Ford", "F-150", "white", 2018, 2.5);
        // vehicles[3] = new Truck("Chevrolet", "Silverado", 2021, 3.0);
        // vehicles[3] = new Truck("Chevrolet", "Silverado", 2021, 3.0);
        vehicles[4] = new Car("Honda", "Accord", "green", 2020, 5);

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                vehicle.displayInfo();
                System.out.println("Number of Seats: " + ((Car) vehicle).getNumberOfSeats());
            } else if (vehicle instanceof Truck) {
                vehicle.displayInfo();
                System.out.println("Load Capacity: " + ((Truck) vehicle).getLoadCapacity() + " tons");
            }
        }
    }
}
