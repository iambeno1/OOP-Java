package Dosen;

import java.util.ArrayList;

import Mahasiswa.Mahasiswa;

public class Dosen {
    private String nama;
    private ArrayList<Mahasiswa> mahasiswas;

    public void anakWali(Mahasiswa mahasiswa){
        if(mahasiswas == null){
            mahasiswas = new ArrayList<>();
        }
        mahasiswas.add(mahasiswa);
    }

    public void displayAnkWali(){
        System.out.println("Nama Dosen \t: " + nama);
        System.out.println("Daftar anak wali");
        for(Mahasiswa mhs : mahasiswas){
            System.out.println(mhs.getNama());
            System.out.println(mhs.getNIM());
            System.out.println();
        }
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMahasiswas(ArrayList<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

    public ArrayList<Mahasiswa> getMahasiswas() {
        return mahasiswas;
    }
}
