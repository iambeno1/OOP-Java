package folder1;

import java.util.ArrayList;

public class Dosen {
    private String nama;
    ArrayList<Mahasiswa> mahasiswas;

    public Dosen(String nama, ArrayList<Mahasiswa> mahasiswas){
        this.nama = nama;
        this.mahasiswas = mahasiswas;
    }

    public void getMahasiswa(){
        for(int i = 0; i < mahasiswas.size(); i++){
            System.out.println(mahasiswas.get(i).getNama());
        }
    }
    
}
