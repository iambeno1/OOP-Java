import java.util.Scanner;
public class Solutions {
    public static void main(String[] args) throws Exception {
        // ----------Start nomor 1----------
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Data Mahasiswa=====");
        
        System.out.print("Masukkan nama kamu  : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM kamu   : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan nilai UTS  : ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Masukkan nilai UAS  : ");
        double nilaiUAS = input.nextDouble();
        // ----------End nomor 1----------

        double rataRata = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;

        // ----------Start nomor 2----------
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + nim);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai UAS  : " + nilaiUAS);
        System.out.println("Rata-rata  : " + rataRata);
        // ----------End nomor 2----------
        
        // ----------Start nomor 3 & 4----------
        if (rataRata < 60) {
            System.out.println("Status: Kamu TIDAK LULUS");
        }else{
            System.out.println("Status: Selamat Kamu LULUSS");
        }
        // ----------End nomor 3 & 4----------
        
        
        // ----------Start nomor 5----------
        for(int i = 0; i <= 99; i++){
            System.out.println((i+1) + "." + nama + " Akan mendapat nilai A pada praktikum PBO");
        }
        // ----------End nomor 5----------

    }
}
