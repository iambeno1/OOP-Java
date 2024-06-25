package latihan3;

public class Parent {
    private String mahasiswa;
    private String nim;

    public Parent(String mahasiswa, String nim){
        this.mahasiswa = mahasiswa;
        this.nim = nim;
    }

    // Solusi 1: membuat constructor default
    // public Parent(){};

    public String getMahasiswa() {
        return mahasiswa;
    }

    public String getNim() {
        return nim;
    }
}
