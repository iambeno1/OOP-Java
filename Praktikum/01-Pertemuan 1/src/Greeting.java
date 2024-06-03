import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();

        System.out.print("Tahun masuk   : ");
        int tahunMasuk = input.nextInt();

        // Untuk bersihkan layar sepertii pada C++ (system("cls"))
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Tahun masuk : " + tahunMasuk);

        input.close();
    }
}
