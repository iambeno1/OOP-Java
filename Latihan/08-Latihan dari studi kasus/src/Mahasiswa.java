public class Mahasiswa {
    private String NIM;
    private String name;
    private String asalDaerah;

    public Mahasiswa(String NIM, String name, String asalDaerah){
        this.NIM = NIM;
        this.name = name;
        this.asalDaerah = asalDaerah;
    }

    public String getNIM(){
        return NIM;
    }

    public String getName(){
        return name;
    }

    public String getAsalDaerah(){
        return asalDaerah;
    }

    public String display(){
        return "Nama \t: " + name + "\n" +
                "NIM \t: " + NIM + "\n" + 
                "Asal\t: " + asalDaerah + "\n";
    }
}