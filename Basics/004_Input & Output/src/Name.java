import java.util.Scanner;
public class Name {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)){ // Gunakan try untuk mencegah warning
            System.out.print("Masukkan nama kamu: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan umur kamu: ");
            int umur = scanner.nextInt();

            System.out.println("\nNama kamu: " + nama);
            System.out.println("Umur kamu: " + umur);

            // print dan println itu beda, lihat perbedaanya di atas. kalo pake println nanti inputnya dibawah, kalo pake print saja maka inputnya disamping prakata input.
            // Contoh:
        }
    }
}
