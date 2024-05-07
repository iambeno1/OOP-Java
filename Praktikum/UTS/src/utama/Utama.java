package utama;
import dosen.Dosen;
import mahasiswa.Mahasiswa;
import mataKuliah.MataKuliah;

public class Utama {
    public static void main(String[] args) {
        // Membuat objek dosen
        Dosen cahya = new Dosen("Cahya", "001");
        Dosen budi = new Dosen("Budi", "002");

        // Membuat objek mahasiswa
        Mahasiswa tiara = new Mahasiswa("Tiara", "101");
        Mahasiswa diana = new Mahasiswa("Diana", "102");

        // Membuat objek mata kuliah
        MataKuliah pbo = new MataKuliah("PBO", "123");
        MataKuliah kompar = new MataKuliah("Kompar", "124");
        MataKuliah metnum = new MataKuliah("Metnum", "125");

        // Menetapkan pengampu dan daftar mahasiswa untuk setiap mata kuliah
        pbo.getPengampu().add(cahya);
        pbo.getDaftarMahasiswas().add(tiara);
        pbo.getDaftarMahasiswas().add(diana);

        kompar.getPengampu().add(budi);
        kompar.getDaftarMahasiswas().add(tiara);
        kompar.getDaftarMahasiswas().add(diana);

        metnum.getPengampu().add(budi);
        metnum.getDaftarMahasiswas().add(tiara);

        // Menampilkan data untuk setiap mata kuliah
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }

    // Method untuk menampilkan data pengampu dan daftar mahasiswa untuk tiap mata kuliah
    public static void tampilkanData(MataKuliah matakuliah) {
        System.out.println("Mata Kuliah: " + matakuliah.getNamaMK());
        System.out.println("Kode Mata Kuliah: " + matakuliah.getKodeMK());
        System.out.println("Pengampu: ");
        for (Dosen dosen : matakuliah.getPengampu()) {
            System.out.println("- " + dosen.getNama());
        }
        System.out.println("Mahasiswa: ");
        for (Mahasiswa mahasiswa : matakuliah.getDaftarMahasiswas()) {
            System.out.println("- " + mahasiswa.getNama());
        }
        System.out.println();
    }
}
