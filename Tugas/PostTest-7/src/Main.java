import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Buat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("105222001", "John Doe", 85.5);
        Mahasiswa mhs2 = new Mahasiswa("105222002", "Erick", 90.0);
        Mahasiswa mhs3 = new Mahasiswa("105222003", "Alice", 75.8);
        Mahasiswa mhs4 = new Mahasiswa("105222004", "Bob", 80.5);
        Mahasiswa mhs5 = new Mahasiswa("105222005", "Charlie", 95.0);
        Mahasiswa mhs6 = new Mahasiswa("105222006", "David", 85.8);
        Mahasiswa mhs7 = new Mahasiswa("105222007", "Emma", 90.5);
        Mahasiswa mhs8 = new Mahasiswa("105222008", "Frank", 75.0);
        Mahasiswa mhs9 = new Mahasiswa("105222009", "Grace", 80.8);
        Mahasiswa mhs10 = new Mahasiswa("10522210", "Hannah", 95.5);

        // Buat objek kelas
        Kelas kelasPBO = new Kelas("Kelas PBO");
        Kelas kelasMetnum = new Kelas("Kelas Metnum");
        Kelas kelasRPL = new Kelas("Kelas RPL");

        // Bagi objek mahasiswa ke dalam masing-masing kelas
        kelasPBO.tambahMahasiswa(mhs1);
        kelasPBO.tambahMahasiswa(mhs2);
        kelasPBO.tambahMahasiswa(mhs3);
        kelasMetnum.tambahMahasiswa(mhs4);
        kelasMetnum.tambahMahasiswa(mhs5);
        kelasMetnum.tambahMahasiswa(mhs6);
        kelasRPL.tambahMahasiswa(mhs7);
        kelasRPL.tambahMahasiswa(mhs8);
        kelasRPL.tambahMahasiswa(mhs9);
        kelasRPL.tambahMahasiswa(mhs10);

        // Inisiasi arrayList dengan nama daftarKelas
        ArrayList<Kelas> daftarKelas = new ArrayList<>();
        
        // Masukkan semua objek kelas ke dalam variabel daftarKelas
        daftarKelas.add(kelasPBO);
        daftarKelas.add(kelasMetnum);
        daftarKelas.add(kelasRPL);

        // Panggil fungsi hitungRataRataSemuaKelas
        hitungRataRataSemuaKelas(daftarKelas);

        // Panggil fungsi displayRataRataSemuaKelas
        displayRataRataSemuaKelas(daftarKelas);
    }

    // Fungsi hitung rata-rata nilai mahasiswa dari semua kelas
    public static void hitungRataRataSemuaKelas(ArrayList<Kelas> daftarKelas) {
        double totalRataRata = 0;
        for (Kelas kelas : daftarKelas) {
            double rataRataKelas = kelas.hitungRataRata();
            System.out.println("Rata-rata nilai di " + kelas.getNamaKelas() + ": " + rataRataKelas);
            totalRataRata += rataRataKelas;
        }
        System.out.println("Rata-rata nilai semua kelas: " + (totalRataRata / daftarKelas.size()));
    }

    // Fungsi display rata-rata nilai dari semua kelas
    public static void displayRataRataSemuaKelas(ArrayList<Kelas> daftarKelas) {
        int totalMahasiswa = 0;
        for (Kelas kelas : daftarKelas) {
            System.out.println("Jumlah mahasiswa di " + kelas.getNamaKelas() + ": " + kelas.getDaftarMahasiswa().size());
            totalMahasiswa += kelas.getDaftarMahasiswa().size();
        }
        System.out.println("Jumlah mahasiswa dari semua kelas: " + totalMahasiswa);
    }
}


