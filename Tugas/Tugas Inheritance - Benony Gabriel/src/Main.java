public class Main {
    public static void main(String[] args) {
        // Membuat objek Parent
        Parent parent = new Parent("Joko Susanto");
        // Membuat objek Child
        Child child = new Child("Beno", "105222002");

        System.out.println("Parent Info : ");
        parent.displayInfo();  // Menampilkan informasi Parent

        System.out.println("\nChild Info : ");
        child.displayInfo();  // Menampilkan informasi Child, termasuk informasi Parent melalui super.displayInfo()

        // Mengubah nilai atribut name di instance child
        child.name = "Rido";

        System.out.println("\nUpdated Child Info : ");
        child.displayInfo();  // Menampilkan informasi Child setelah perubahan nama

        System.out.println("\nParent Info setelah memodifikasi Child : ");
        parent.displayInfo();  // Menampilkan informasi Parent untuk memastikan bahwa perubahan di Child tidak mempengaruhi Parent
    }
}

/*
TEORI

1. Pengaruh Keyword super dalam Inheritance
Keyword super dalam Java digunakan untuk merujuk ke superclass atau parent class dari objek saat ini. Dalam konteks inheritance, super memiliki beberapa kegunaan penting:

- Mengakses Konstruktor Parent: super dapat digunakan untuk memanggil konstruktor dari parent class dalam konstruktor child class. Ini penting ketika parent class memiliki konstruktor yang perlu diinisialisasi sebelum child class dapat berfungsi dengan benar.

- Mengakses Method dan Atribut Parent: super dapat digunakan untuk memanggil metode atau mengakses atribut dari parent class yang telah di-overridden atau disembunyikan di child class. Ini memungkinkan child class untuk memperluas atau mengubah perilaku dari method parent tanpa sepenuhnya menggantikan fungsionalitasnya.


2. Perubahan Data di Parent jika Nilai di Parent Diubah di Child
Ketika sebuah nilai atau atribut di parent class diubah melalui child class, tidak ada perubahan langsung pada data parent class kecuali atribut tersebut adalah bagian dari instance yang sama. Perubahan hanya terjadi pada instance spesifik yang diubah, bukan pada definisi class secara keseluruhan. Berikut adalah dua skenario umum:

- Instance-Specific Changes: Jika sebuah child class mengubah nilai atribut yang diwariskan dari parent class, perubahan ini hanya berlaku untuk instance tersebut dan bukan untuk class parent itu sendiri.

- Static Fields: Jika atribut yang diubah adalah static, maka perubahan tersebut akan berdampak pada semua instance dari class tersebut karena static fields adalah milik class, bukan instance.

Dengan demikian, perubahan yang dilakukan di child class hanya mempengaruhi instance spesifik yang diubah, kecuali untuk atribut static yang mempengaruhi seluruh class.
 */