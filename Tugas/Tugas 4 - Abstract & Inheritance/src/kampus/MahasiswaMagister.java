package kampus;

/**
 * Class MahasiswaMagister merupakan subclass dari Mahasiswa yang mengimplementasikan metode abstrak tugasAkhir
 * dan metode dari interface AktivitasKampus.
 */

public class MahasiswaMagister extends Mahasiswa implements AktivitasKampus {
    // Constructor untuk inisialisasi nama dan nim menggunakan constructor superclass
    public MahasiswaMagister(String nama, String nim) {
        super(nama, nim);
    }

    // Implementasi metode abstrak dari Mahasiswa
    @Override
    public void tugasAkhir() {
        System.out.println(getNama() + " sedang mengerjakan tesis.");
    }

    // Implementasi metode dari interface AktivitasKampus
    @Override
    public void menghadiriKuliah() {
        System.out.println(getNama() + " menghadiri kuliah dua kali seminggu.");
    }

    @Override
    public void mengikutiOrganisasi() {
        System.out.println(getNama() + " ikut dalam organisasi dosen.");
    }
}
