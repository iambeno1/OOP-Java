public class Main {
    public static void main(String[] args) throws Exception {
        // Buat 2 objek
        MyClass orang1 = new MyClass();
        MyClass orang2 = new MyClass();

        orang1.nama = "Benony Gabriel";
        orang1.NIM = "105222002";

        orang2.nama = "John Doe";
        // Jangan mengakses NIM melalui instance orang1 atau orang2
        // Karena NIM adalah variabel static, akses melalui nama kelas MyClass
        // orang2.NIM = "105333003"; // Jangan melakukan ini

        System.out.println(orang1.salam()); // Outputnya "Hallo nama saya Benony Gabriel dengan NIM 105222002"
        System.out.println(orang2.salam()); // Outputnya "Hallo nama saya John Doe dengan NIM 105222002"
    }
}
