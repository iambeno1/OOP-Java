public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.Tugas = 90f;
        mhs1.UTS = 100f;
        mhs1.UAS = 100f;
        System.out.println("Nilai kamu " + mhs1.hitungNilai());
        System.out.println("Nilai rata-rata: " + mhs1.rataRata(98.9f, 100f, 99f));

        /*
        Tugas:
        Bikin sebuah class
        bikin data dlm klas itu hanya satu (bentuk static)
        ada satu method
        lalu bikin dua objek di main
         */
    }
}
