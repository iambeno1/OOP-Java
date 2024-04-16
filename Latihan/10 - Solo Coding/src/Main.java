import Mahasiswa.Mahasiswa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Benony Gabriel");
        mhs1.setNIM("105222002");
        mhs1.setTahunMasuk(2022);

        ArrayList<Double> nilaiMhs1 = new ArrayList<>();
        nilaiMhs1.add(99.8);
        nilaiMhs1.add(97.5);
        nilaiMhs1.add(99.0);
        nilaiMhs1.add(100.0);

        ArrayList<Double> nilaiPBO = new ArrayList<>();
        nilaiPBO = nilaiMhs1;

        System.out.println(mhs1.nilaiRataRata(nilaiPBO));

    }
}
