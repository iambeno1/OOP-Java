import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static int jumlahMahasiswa = 0;

    // Constructor dengan 1 parameter
    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    // Fungsi tambah mahasiswa ke dalam kelas
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        jumlahMahasiswa++;
    }

    // Fungsi hapus mahasiswa dalam kelas (berdasarkan nim)
    public void hapusMahasiswa(String nim) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNim().equals(nim)) {
                daftarMahasiswa.remove(i);
                jumlahMahasiswa--;
                break;
            }
        }
    }

    // Fungsi hitung rata-rata nilai mahasiswa dalam kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        int total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return (double) total / daftarMahasiswa.size();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }
}
