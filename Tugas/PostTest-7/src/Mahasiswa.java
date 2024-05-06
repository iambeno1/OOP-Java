public class Mahasiswa {
    private String nim;
    private String nama;
    private Double nilai;

    // Constructor dengan 3 parameter
    public Mahasiswa(String nim, String nama, Double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Constructor dengan 2 parameter (nilai default 0)
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = 0.0;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }
}
