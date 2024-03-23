public class Main {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {80, 75, 90, 85, 95};
        
        Nilai nilai = new Nilai(nilaiMahasiswa);
        double rataRata = nilai.hitungRataRata();
        
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
