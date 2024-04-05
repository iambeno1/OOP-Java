public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10);

        // Menggunakan setter untuk mengubah jari-jari
        lingkaran.setJari2(5);

        // Menggunakan getter untuk mendapatkan jari-jari
        double jari2 = lingkaran.getJari2();
        System.out.println("Jari-jari lingkaran: " + jari2);

        // Menggunakan getter untuk mendapatkan luas lingkaran
        double luas = lingkaran.getLuas();
        System.out.println("Luas lingkaran: " + luas);


        // Membuat objek Data
        Data data = new Data();

        // Mengakses variabel publik dan menetapkannya nilainya
        data.intPublic = 5;

        // Mengakses variabel privat dengan menggunakan getter
        int privateInt = data.getIntPrivate();
        System.out.println("Private int: " + privateInt);

        // Menggunakan setter untuk menetapkan nilai variabel privat lainnya
        data.setDblPrivate(3.14);

        // Memanggil method display untuk menampilkan nilai variabel
        data.display();

        


        // Memanggil static method sum()
        int sumResult = StaticMethod.sum(5, 3);
        System.out.println("Hasil penjumlahan: " + sumResult);

        // Memanggil static method multiply()
        int multiplyResult = StaticMethod.multiply(5, 3);
        System.out.println("Hasil perkalian: " + multiplyResult);
        
    }
}
