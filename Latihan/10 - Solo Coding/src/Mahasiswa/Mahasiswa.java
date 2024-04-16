package Mahasiswa;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String NIM;
    private int tahunMasuk;
    private ArrayList<Integer> listNilai;

    public Mahasiswa(){}

    public Mahasiswa(String nama, String NIM, int tahunMasuk, ArrayList<Integer> listNilai){
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

    public void setListNilai(ArrayList<Integer> listNilai){
        this.listNilai = listNilai;
    }

    public ArrayList<Integer> getListNilai(){
        return listNilai;
    }
}
