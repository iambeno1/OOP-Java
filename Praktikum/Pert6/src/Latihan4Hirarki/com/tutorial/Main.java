package Latihan4Hirarki.com.tutorial;

// ini akan mengimport class Console 
import com.terminal.Console;
// ini akan mengimport class Coba 
import com.terminal.Coba;
// mengimport static method dari console; 
import static com.terminal.Console.log;


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
