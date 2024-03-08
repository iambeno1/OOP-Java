import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa:");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); 

        // Array 2 dimnsi untuk menyimpan data mahasiswa
        String[][] mahasiswa = new String[jumlahMahasiswa][5]; // 5 kolom: nama, nim, nilai tugas, nilai UTS, nilai UAS

        // Memasukkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            mahasiswa[i][0] = scanner.nextLine();
            System.out.print("NIM: ");
            mahasiswa[i][1] = scanner.nextLine();
            System.out.print("Nilai Tugas: ");
            mahasiswa[i][2] = scanner.nextLine();
            System.out.print("Nilai UTS: ");
            mahasiswa[i][3] = scanner.nextLine();
            System.out.print("Nilai UAS: ");
            mahasiswa[i][4] = scanner.nextLine();
        }

        // Membuat kelompok
        String[][] kelompok = new String[(jumlahMahasiswa + 2) / 3][3]; // Hitung jumlah kelompok
        int indexMahasiswa = 0;
        for (int i = 0; i < kelompok.length; i++) {
            for (int j = 0; j < kelompok[i].length; j++) {
                if (indexMahasiswa < jumlahMahasiswa) {
                    kelompok[i][j] = mahasiswa[indexMahasiswa][0]; 
                    indexMahasiswa++;
                }
            }
        }

        // Menampilkan kelompok dan anggotanya
        System.out.println("\nKelompok Mahasiswa:");
        for (int i = 0; i < kelompok.length; i++) {
            System.out.println("Kelompok " + (i + 1) + ":");
            for (int j = 0; j < kelompok[i].length; j++) {
                if (kelompok[i][j] != null) {
                    System.out.println("- " + kelompok[i][j]);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
