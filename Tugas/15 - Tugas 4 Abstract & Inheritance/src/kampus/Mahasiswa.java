package kampus;

/**
 * Abstract class Mahasiswa mendefinisikan atribut dasar dan metode yang harus dimiliki oleh setiap mahasiswa.
 */
public abstract class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void tugasAkhir();

    // Metode konkret yang dapat digunakan oleh subclass
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
