import Mahasiswa.Mahasiswa;

import java.util.ArrayList;

import Dosen.Dosen;

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

        System.out.println();
        
        // Test print
        System.out.print("Print langsung : ");
        System.out.print(nilaiMhs1);
        
        System.out.println();
        
        // Test print index
        System.out.print("\nPrint index : ");
        System.out.print(nilaiMhs1.get(0) + " ");
        System.out.print(nilaiMhs1.get(1));
        
        System.out.println();
        
        // Test print semua elemen
        System.out.print("\nPrint pake foreach: ");
        for(double i : nilaiMhs1){
            System.out.print(i + " ");
        }
        
        System.out.println();

        // Passing Array
        ArrayList<Double> nilaiPBO = new ArrayList<>();
        nilaiPBO = nilaiMhs1;
        
        System.out.println("Rata-rata : " + mhs1.nilaiRataRata(nilaiPBO));
        
        
        // Assign nilai
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS;
        nilaiKuis = nilaiMhs1.get(0);
        nilaiTugas = nilaiMhs1.get(1);
        nilaiUTS = nilaiMhs1.get(2);
        nilaiUAS = nilaiMhs1.get(3);
        
        System.out.println();
        
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        
        System.out.println();

        System.out.println("Data Mahasiswa");

        System.out.println("Nama \t\t: " + mhs1.getNama());
        System.out.println("NIM \t\t: " + mhs1.getNIM());
        System.out.println("Tahun Masuk \t: " + mhs1.getTahunMasuk());
        System.out.println(mhs1.getListNilai());

        // Buat mahasiswa baru
        // Nilai maba
        ArrayList<Double> nilaiMhs2 = new ArrayList<>();
        nilaiMhs2.add(70.0);
        nilaiMhs2.add(80.0);
        nilaiMhs2.add(65.0);
        nilaiMhs2.add(60.0);
        Mahasiswa mhs2 = new Mahasiswa("Amelia", "105222001", 2022, nilaiMhs2);

        System.out.println();

        System.out.println("Nama \t\t: " + mhs2.getNama());
        System.out.println("NIM \t\t: " + mhs2.getNIM());
        System.out.println("Tahun Masuk \t: " + mhs2.getTahunMasuk());
        System.out.println("Nilai rata-rat \t: " + mhs2.nilaiRataRata(nilaiMhs2));

        System.out.println();

        mhs2.displayMhs();


        System.out.println();

        // Khusus untuk mhs1
        mhs1.setListNilai(nilaiMhs1);
        System.out.println(mhs1.getListNilai());
        
        mhs1.displayMhs();

        System.out.println();

        // Buat Dosen dan anak walinya
        Dosen dosen = new Dosen();
        dosen.setNama("Dr. Ariana");

        dosen.anakWali(mhs1);
        dosen.anakWali(mhs2);

        dosen.displayAnkWali();
    }
}

