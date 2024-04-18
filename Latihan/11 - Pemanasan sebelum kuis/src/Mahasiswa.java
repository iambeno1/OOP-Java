import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;

    private ArrayList<Double> ipSemester = new ArrayList<>();

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void display(){
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
    }

    public void isiIpSemester(int semester, double ip){
        ipSemester.add(ip);
    }

    public double hitungIPK(){
        double ipk = 0;
        double total = 0;
        for(double ip : ipSemester){
            total += ip;
        }
        ipk = total / ipSemester.size();
        return ipk;
    }

    public void setIpSemester(ArrayList<Double> ipSemester) {
        this.ipSemester = ipSemester;
    }

    public ArrayList<Double> getIpSemester() {
        return ipSemester;
    }


    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}
