package main;

import kampus.MahasiswaSarjana;
import kampus.MahasiswaMagister;

public class Main {
    public static void main(String[] args) {
        // Buat objek mahasiswa
        MahasiswaSarjana mhs1 = new MahasiswaSarjana("Beno", "105222001");
        MahasiswaMagister mhs2 = new MahasiswaMagister("Joko", "105222002");

        // Informasi Mahasiswa Sarjana
        mhs1.infoMahasiswa();
        mhs1.tugasAkhir();
        mhs1.menghadiriKuliah();
        mhs1.mengikutiOrganisasi();

        System.out.println();

        // Informasi Mahasiswa Magister
        mhs2.infoMahasiswa();
        mhs2.tugasAkhir();
        mhs2.menghadiriKuliah();
        mhs2.mengikutiOrganisasi();
    }
}
