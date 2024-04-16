package folder2;

import folder1.Dosen;
import folder1.Mahasiswa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Beno");
        System.out.println(mhs.getNama());

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(100);
        arr.add(100);

        mhs.setNilai(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2 = mhs.getNilai();

        for(int i = 0; i < arr2.size(); i++){
            System.out.println(arr2.get(i));
        }

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Alia");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Malika");

        ArrayList<Mahasiswa> arrMhs = new ArrayList<>();
        arrMhs.add(mhs);
        arrMhs.add(mhs1);
        arrMhs.add(mhs2);

        Dosen dsn = new Dosen("Budi", arrMhs);
        dsn.getMahasiswa();
    }
}
