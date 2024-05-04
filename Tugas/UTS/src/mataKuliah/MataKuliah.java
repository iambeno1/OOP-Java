package mataKuliah;
import dosen.Dosen;
import mahasiswa.Mahasiswa;

import java.util.ArrayList;

public class MataKuliah {
    private String namaMK;
    private String kodeMK;
    private ArrayList<Dosen> pengampu = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswas = new ArrayList<>();

    public MataKuliah(String namaMK, String kodeMK){
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
    }

    public void setDaftarMahasiswas(ArrayList<Mahasiswa> daftarMahasiswas) {
        this.daftarMahasiswas = daftarMahasiswas;
    }

    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswas() {
        return daftarMahasiswas;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }

}
