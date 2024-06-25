package latihan3;

import java.util.ArrayList;

public class Child extends Parent {

    private int angkatan;

    public Child(String mahasiswa, String nim, int angkatan){
        super(mahasiswa, nim);
        this.angkatan = angkatan;
    }

    public void hitungIp(ArrayList<Double> listNilai){
        if(listNilai.isEmpty()){
            System.out.println("Nilai tidak boleh kosong!");
        }

        double totalNilai = 0.0;
        for(double nilai : listNilai){
            totalNilai += nilai;
        }

        double rataRata = totalNilai / listNilai.size();
        System.out.println(rataRata);
    }

    public int getAngkatan() {
        return angkatan;
    }
}
