public class Hotel {
    private String name;
    private Room[] rooms;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room(i + 1, "Standard");
        }
        System.out.println("Constructor Hotel with name and numberOfRooms is called");
    }

    public Hotel(String name, int numberOfStandardRooms, int numberOfDeluxeRooms) {
        this.name = name;
        int totalRooms = numberOfStandardRooms + numberOfDeluxeRooms;
        this.rooms = new Room[totalRooms];
        for (int i = 0; i < totalRooms; i++) {
            if (i < numberOfStandardRooms) {
                rooms[i] = new Room(i + 1, "Standard");
            } else {
                rooms[i] = new Room(i + 1, "Deluxe");
            }
        }
        System.out.println("Constructor Hotel with name, numberOfStandardRooms, and numberOfDeluxeRooms is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
