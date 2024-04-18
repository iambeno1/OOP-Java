import Universitas.Dosen;
import Universitas.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Ali", "12345");
        Mahasiswa mhs2 = new Mahasiswa("Beno", "12346");

        // Nilai mahasiswa 1 (Ali)
        mhs1.tambahNilai("PBO", 98.5);
        mhs1.tambahNilai("Matematika", 97.5);
        mhs1.tambahNilai("Fisika", 98.0);
        
        // Nilai mahasiswa 2 (Beno)
        mhs2.tambahNilai("PBO", 98.5);
        mhs2.tambahNilai("Matematika", 97.5);
        mhs2.tambahNilai("Fisika", 98.0);

        // Print Data Mahasiswa
        mhs1.printDataMhs();
        mhs2.printDataMhs();

        // Print jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa = " + Mahasiswa.getJumlahMahasiswa());

        // Set Dosen
        Dosen dosenPBO = new Dosen("Dr. Budi");

        System.out.println("\nNama Dosen Pengajar: " + dosenPBO.getNamaDosen());

        mhs1.setNamaDosenPengajar(dosenPBO.getNamaDosen());
        System.out.println("Nama Dosen Pengajar mhs1 : " + mhs1.getNamaDosenPengajar());
        
    }
}
