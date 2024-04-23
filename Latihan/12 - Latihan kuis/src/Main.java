import universitas.Dosen;
import universitas.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Ali", "12345");
        Mahasiswa mhs2 = new Mahasiswa("Beno", "12346");

        mhs1.tambahNilai("PBO", 97.8);
        mhs1.tambahNilai("Matematika", 98.0);
        mhs1.tambahNilai("Fisika", 95.5);
        
        mhs2.tambahNilai("PBO", 100.0);
        mhs2.tambahNilai("Matematika", 99.5);
        mhs2.tambahNilai("Fisika", 97.8);

        System.out.println("Data Mahasiswa 1");
        mhs1.printDataMhs();

        System.out.println();

        System.out.println("Data Mahasiswa 2");
        mhs2.printDataMhs();

        System.out.println();

        System.out.println("Total mahasiswa : " + Mahasiswa.getJumlahMhs());

        System.out.println();

        Dosen dosenPBO = new Dosen();
        dosenPBO.setNama("Budi");

        System.out.println("Dosen PBO : " + dosenPBO.getNama());

        mhs1.setNamaDosenPengajar(dosenPBO.getNama());
        mhs2.setNamaDosenPengajar(dosenPBO.getNama());
    }
}
