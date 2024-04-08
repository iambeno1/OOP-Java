package Latihan4Hirarki.com.terminal;

// Visibilitas class diubah menjadi public
public class Console {

    // Metode log yang dapat diakses dari mana saja
    public static void log(String message) {
        System.out.println(message);
    }
}
    // Metode log yang hanya dapat diakses dari dalam paket com.terminal
    class terminal{
        public static void log(String message) {
            System.out.println(message);
        }
    }

