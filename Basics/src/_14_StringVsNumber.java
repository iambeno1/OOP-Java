public class _14_StringVsNumber {
    public static void main(String[] args) {
        /*Peringatan:
         * PERINGATAN!
            Java menggunakan operator + untuk penambahan dan penggabungan.
            Angka ditambahkan. String digabungkan.
         */

        // Untuk integer
        int a = 10;
        int b = 20;
        int tambah = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Tambah = a + b");
        System.out.println("Tambah = " + tambah);

        // String, akan mengalami concatenation/penggabuangan string
        String aStr = "10";
        String bStr = "20";
        String strTambah = aStr + bStr;
        System.out.println("aStr = " + aStr);
        System.out.println("bStr = " + bStr);
        System.out.println("strTambha = aStr + bStr");
        System.out.println("strTambah = " + strTambah);

        // int + string
        String hasil = a + bStr;
        System.out.println("Hasil = " + hasil);
        // int hasilint = a + bStr; // akan error
    }
}
