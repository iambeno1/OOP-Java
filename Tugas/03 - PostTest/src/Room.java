public class Room {
    private int roomNumber;
    private String roomType;
    private boolean occupied;
    private double rate;

    Room(){
        this.roomNumber = 0;
        this.roomType = "Standard";
        this.occupied = false;
        this.rate = 100.0d;

        System.out.println("Constructor Room default is called");
    }

    Room(int roomNumber, String roomType){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = false;

        if(this.roomType == "Standard"){
            this.rate = 100.0d;
        }else if(this.roomType == "Deluxe"){
            this.rate = 200.0d;
        }else{
            System.out.println("Tipe kamar tidak tersedia!");
        }

        System.out.println("Constructor Room with roomNumber and roomType is called");
    }

    Room(int roomNumber, String roomType, boolean occupied, double rate){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;

        System.out.println("Constructor Room with all parameters is called");
    }

    // Buat fungsi setter dan getter
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}
