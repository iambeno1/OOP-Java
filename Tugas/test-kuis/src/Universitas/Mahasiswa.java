package Universitas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<String> nilai = new ArrayList<>();
    private static int jumlahMahasiswa = 0;
    private String namaDosenPengajar;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        jumlahMahasiswa++;
    }

    public void tambahNilai(String nilaiMatkul) {
        nilai.add(nilaiMatkul);
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setNamaDosenPengajar(String namaDosenPengajar) {
        this.namaDosenPengajar = namaDosenPengajar;
    }

    public String getNamaDosenPengajar() {
        return namaDosenPengajar;
    }

    public void display() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Nilai Mata Kuliah:");
        for (String nilaiMatkul : nilai) {
            System.out.println("- " + nilaiMatkul);
        }
        System.out.println("Dosen Pengajar: " + namaDosenPengajar);
    }
}

