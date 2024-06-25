public class Person {
    String nama;
    int umur;
    String prodi;
    String NIM;

    // Constructor
    Person(){
        // this(null, 25); // memanggil constructor lain yang parameternya sekian
    }

    // Constructor dengan parameter
    Person(String parName, int parUmur){
        nama = parName;
        umur = parUmur;
    }

    // Ini juga constructor
    Person(String nama, String NIM, String prodi, int umur){
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        this.umur = umur;
    }

    // Memanggil constructor lain
    Person(String nama){
        this(nama, "105222013", "Informatika", 18);
    }
}
