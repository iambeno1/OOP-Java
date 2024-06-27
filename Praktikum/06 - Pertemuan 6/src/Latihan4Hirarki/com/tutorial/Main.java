package Latihan4Hirarki.com.tutorial;

// ini akan mengimport class Console 
import Latihan4Hirarki.com.terminal.Console;
// ini akan mengimport class Coba 
import Latihan4Hirarki.com.terminal.Coba;
// mengimport static method dari console; 
import static Latihan4Hirarki.com.terminal.Console.log;


class Main{
    public static void main(String[] args) {
        Player player1 = new Player ("Otong");
        player1.show();
        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());
        Coba.log("Hello");
        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
