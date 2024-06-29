// File: HotelReservationSystem.java
public class HotelReservationSystem {
    public static void main(String[] args) {
        // Buat hotel dengan 5 ruangan standar
        Hotel hotel1 = new Hotel("Grand Hotel", 5);

        // Buat hotel dengan 3 ruangan standar dan 2 ruangan deluxe
        Hotel hotel2 = new Hotel("Luxury Resort", 3, 2);

        // Buat sebuah resevasi utk ruangan 1 di hotel1 untuk 3 malam
        Reservation reservation1 = new Reservation(hotel1.getRooms()[0], "Benony Gabriel", 3);

        // Buat sebuah reservasi untuk 2 ruangan di hotel untuk 5 malam
        Reservation reservation2 = new Reservation(hotel2.getRooms()[1], "Randy Orton", 5);

        // Menampilkan informasi tentang reservasi
        System.out.println("Reservation 1:");
        System.out.println("Guest Name: " + reservation1.getGuestName());
        System.out.println("Room Number: " + reservation1.getReservedRoom().getRoomNumber());
        System.out.println("Number of Nights: " + reservation1.getNumberOfNights());
        System.out.println("Total Charge: Rp." + reservation1.getTotalCharge());

        System.out.println();

        System.out.println("Reservation 2:");
        System.out.println("Guest Name: " + reservation2.getGuestName());
        System.out.println("Room Number: " + reservation2.getReservedRoom().getRoomNumber());
        System.out.println("Number of Nights: " + reservation2.getNumberOfNights());
        System.out.println("Total Charge: Rp." + reservation2.getTotalCharge());
    }
}
