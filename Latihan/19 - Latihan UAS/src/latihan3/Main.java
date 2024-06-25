package latihan3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Child mhs = new Child("Benony Gabriel", "105222002", 2022);

        ArrayList<Double> listNilai = new ArrayList<>();
        listNilai.add(88.2);
        listNilai.add(90.0);
        listNilai.add(95.5);  

        System.out.println("Nama \t: " + mhs.getMahasiswa());
        System.out.println("NIM \t: " + mhs.getNim());
        System.out.println("Angkatan : " + mhs.getAngkatan());
        System.out.print("IP \t: "); mhs.hitungIp(listNilai);

    }
}
