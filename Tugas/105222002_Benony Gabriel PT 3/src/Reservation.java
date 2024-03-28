public class Reservation {
    private Room reservedRoom;
    private String guestName;
    private int numberOfNights;
    private double totalCharge;

    public Reservation(Room reservedRoom, String guestName, int numberOfNights) {
        this.reservedRoom = reservedRoom;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
        calculateTotalCharge();
        System.out.println("Constructor Reservation is called");
    }

    private void calculateTotalCharge() {
        this.totalCharge = reservedRoom.getRate() * numberOfNights;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(Room reservedRoom) {
        this.reservedRoom = reservedRoom;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
        calculateTotalCharge();
    }

    public double getTotalCharge() {
        return totalCharge;
    }
}
