import Universitas.Dosen;
import Universitas.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswaBaru1 = new Mahasiswa("Ali", "12345");
        Mahasiswa mahasiswaBaru2 = new Mahasiswa("Budi", "54321");

        mahasiswaBaru1.tambahNilai("PBO");
        mahasiswaBaru1.tambahNilai("Matematika");
        mahasiswaBaru1.tambahNilai("Fisika");

        mahasiswaBaru2.tambahNilai("Pemrograman Web");
        mahasiswaBaru2.tambahNilai("Basis Data");
        mahasiswaBaru2.tambahNilai("Algoritma");

        System.out.println("Informasi Mahasiswa 1:");
        mahasiswaBaru1.display();

        System.out.println("\nInformasi Mahasiswa 2:");
        mahasiswaBaru2.display();

        System.out.println("\nJumlah Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());

        Dosen dosenPBO = new Dosen("Pak Joko");
        System.out.println("\nNama Dosen Pengajar: " + dosenPBO.getNamaDosen());

        mahasiswaBaru1.setNamaDosenPengajar(dosenPBO.getNamaDosen());
        System.out.println("\nNama Dosen Pengajar Mahasiswa 1: " + mahasiswaBaru1.getNamaDosenPengajar());
    }
}
