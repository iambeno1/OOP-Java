package Universitas;

public class Dosen {
    private String namaDosen;

    // Constructor dosen
    public Dosen(String namaDosen){
        this.namaDosen = namaDosen;
    }

    // Setter dan Getter namaDosen
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }
}
