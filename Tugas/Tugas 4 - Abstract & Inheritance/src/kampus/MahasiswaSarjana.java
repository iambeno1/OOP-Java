package kampus;

/**
 * Class MahasiswaSarjana merupakan subclass dari Mahasiswa yang mengimplementasikan metode abstrak tugasAkhir
 * dan metode dari interface AktivitasKampus.
 */

public class MahasiswaSarjana extends Mahasiswa implements AktivitasKampus {
    // Constructor untuk inisialisasi nama dan nim menggunakan constructor superclass
    public MahasiswaSarjana(String nama, String nim) {
        super(nama, nim);
    }

    // Implementasi metode abstrak dari Mahasiswa
    @Override
    public void tugasAkhir() {
        System.out.println(getNama() + " sedang mengerjakan skripsi.");
    }

    // Implementasi metode dari interface AktivitasKampus
    @Override
    public void menghadiriKuliah() {
        System.out.println(getNama() + " menghadiri kuliah setiap hari.");
    }

    @Override
    public void mengikutiOrganisasi() {
        System.out.println(getNama() + " aktif dalam organisasi kemahasiswaan.");
    }
}
