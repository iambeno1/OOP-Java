public class Main {
    public static void main(String[] args) throws Exception {
        Person orang1 = new Person();
        orang1.nama = "Benony Gabriel";
        orang1.umur = 19;
        orang1.NIM = "105222002";
        orang1.prodi = "Computer Science";

        
        System.out.println("Nama : " + orang1.nama);
        System.out.println("Umur : " + orang1.umur);
        System.out.println("NIM  : " + orang1.NIM);
        System.out.println("Prodi: " + orang1.prodi);
        
        System.out.println();
        
        Person orang2 = new Person("Geri", 20);
        orang2.NIM = "10522003";
        orang2.prodi = "Ilmu Komputer";

        System.out.println("Nama : " + orang2.nama);
        System.out.println("Umur : " + orang2.umur);
        System.out.println("NIM : " + orang2.NIM);
        System.out.println("Prodi: " + orang2.prodi);
    }
}
