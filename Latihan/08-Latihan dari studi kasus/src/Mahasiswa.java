public class Mahasiswa {
    private String NIM;
    private String nama;
    private String asalDaerah;

    public Mahasiswa(String NIM, String nama, String asalDaerah){
        this.NIM = NIM;
        this.nama = nama;
        this.asalDaerah = asalDaerah;
    }

    public void mainMenu(){
        System.out.println("========== Menu Utama ==========");
        System.out.println("1. Tambah data");
        System.out.println("2. Lihat data");
        System.out.println("3. Cari data pake NIM");
        System.out.println("3. Cari data pake alamat");
    }

    public void displayData(){
        System.out.println();
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public String getNIM(){
        return NIM;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setAsalDaerah(String asalDaerah){
        this.asalDaerah = asalDaerah;
    }

    public String getAsalDaerah(){
        return asalDaerah;
    }
}
