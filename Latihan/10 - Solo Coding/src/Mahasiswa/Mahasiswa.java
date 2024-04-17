package Mahasiswa;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String NIM;
    private int tahunMasuk;
    private ArrayList<Double> listNilai;

    public Mahasiswa(){}

    public Mahasiswa(String nama, String NIM, int tahunMasuk, ArrayList<Double> listNilai){
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.listNilai = listNilai;
    }

    public double nilaiRataRata(ArrayList<Double> listNilai){
        double total = 0;
        for(int i = 0; i < listNilai.size(); i++){
            total += listNilai.get(i);
        }

        double rataRata = total / listNilai.size();
        return rataRata;
    }

    public void displayMhs(){
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + NIM);
        System.out.println("Tahun Masuk \t: " + tahunMasuk);
        System.out.println("Nilai \t\t: " + listNilai);
        System.out.println("Nilai rata-rata : " + nilaiRataRata(listNilai));
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public String getNIM(){
        return NIM;
    }

    public void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setListNilai(ArrayList<Double> listNilai){
        this.listNilai = listNilai;
    }

    public ArrayList<Double> getListNilai(){
        return listNilai;
    }
}
