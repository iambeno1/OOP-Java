import java.util.Scanner;

public class Solutions {
    static class Mahasiswa {
        String nim;
        String nama;
        String alamat;

        public Mahasiswa(String nim, String nama, String alamat) {
            this.nim = nim;
            this.nama = nama;
            this.alamat = alamat;
        }

        public String getNim() {
            return nim;
        }

        public String getNama() {
            return nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public String toString() {
            return "NIM\t: " + nim + "\n" +
                    "Nama\t: " + nama + "\n" +
                    "Alamat\t: " + alamat + "\n";
        }
    }

    static Mahasiswa[] mahasiswas = new Mahasiswa[10];
    static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Cari Mahasiswa berdasarkan Alamat");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahDataMahasiswa(scanner);
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    cariMahasiswaByNIM(scanner);
                    break;
                case 4:
                    cariMahasiswaByAlamat(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);

        scanner.close();
    }

    static void tambahDataMahasiswa(Scanner scanner) {
        System.out.println("=== Tambah Data Mahasiswa ===");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
        mahasiswas[size] = mahasiswa;
        size++;
        System.out.println("Data mahasiswa berhasil disimpan!");
    }

    static void tampilkanDataMahasiswa() {
        System.out.println("=== Data Mahasiswa ===");
        if (size == 0) {
            System.out.println("Belum ada data mahasiswa yang tersimpan.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(mahasiswas[i]);
        }
    }

    static void cariMahasiswaByNIM(Scanner scanner) {
        System.out.println("=== Cari Mahasiswa berdasarkan NIM ===");
        System.out.print("Masukkan NIM: ");
        String searchNIM = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (mahasiswas[i].getNim().equalsIgnoreCase(searchNIM)) {
                System.out.println("Data Mahasiswa yang ditemukan:");
                System.out.println(mahasiswas[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data Mahasiswa dengan NIM " + searchNIM + " tidak ditemukan.");
        }
    }

    static void cariMahasiswaByAlamat(Scanner scanner) {
        System.out.println("=== Cari Mahasiswa berdasarkan Alamat ===");
        System.out.print("Masukkan Alamat: ");
        String searchAlamat = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (mahasiswas[i].getAlamat().equalsIgnoreCase(searchAlamat)) {
                if (!found) {
                    System.out.println("Data Mahasiswa yang ditemukan:");
                }
                System.out.println(mahasiswas[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data Mahasiswa dengan Alamat " + searchAlamat + " tidak ditemukan.");
        }
    }
}
