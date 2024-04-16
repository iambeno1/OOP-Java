package folder1;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private ArrayList<Integer> nilai;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNilai(ArrayList<Integer> nilai){
        this.nilai = nilai;
    }

    public ArrayList<Integer> getNilai(){
        return nilai;
    }
}
