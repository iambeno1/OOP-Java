package universitas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<Double> nilai = new ArrayList<>();
    private ArrayList<String> matkul = new ArrayList<>();
    private static int jumlahMhs = 0;

    private String namaDosenPengajar;

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        jumlahMhs++;
    }

    public void tambahNilai(String matkul, Double nilai){
        this.matkul.add(matkul);
        this.nilai.add(nilai);
    }

    public void printDataMhs(){
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Nilai");
        for(int i = 0; i < nilai.size(); i++){
            System.out.println("- " + matkul.get(i) + " : " + nilai.get(i));
        }
        System.out.println("Dosen pengajar: " + namaDosenPengajar);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public ArrayList<Double> getNilai() {
        return nilai;
    }

    public static int getJumlahMhs() {
        return jumlahMhs;
    }

    public void setNamaDosenPengajar(String namaDosenPengajar) {
        this.namaDosenPengajar = namaDosenPengajar;
    }

    public String getNamaDosenPengajar() {
        return namaDosenPengajar;
    }
}
