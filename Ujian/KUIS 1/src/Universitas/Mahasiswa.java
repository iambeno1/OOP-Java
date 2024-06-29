package Universitas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<Double> nilai = new ArrayList<>();
    private static int jumlahMahasiswa = 0;
    private String namaDosenPengajar;

    // Constructor Mahasiswa
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        jumlahMahasiswa++;
    }

    // Method untuk menambahkan nilai
    public void tambahNilai(String matkul, Double nilaiMatkul){
        nilai.add(nilaiMatkul);
    }
    
    // Getter untuk atribut jumlahMahasiswa
    public static int getJumlahMahasiswa(){
        return jumlahMahasiswa;
    }

    // Setter untuk namaDosenPengajar
    public void setNamaDosenPengajar(String namaDosenPengajar) {
        this.namaDosenPengajar = namaDosenPengajar;
    }

    // Getter untuk namaDosenPengajar
    public String getNamaDosenPengajar() {
        return namaDosenPengajar;
    }

    // Print data mahasiswa
    public void printDataMhs(){
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Nilai Matkul \t: ");
        for (Double nilaiMhs : nilai) {
            System.out.println("- " + nilaiMhs);
        }
        System.out.println("Dosen Pengajar: " + namaDosenPengajar);
    }
}