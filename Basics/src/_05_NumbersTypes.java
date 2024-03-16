public class _05_NumbersTypes {
    public static void main(String[] args) {
        // Integer types

        // Byte
        // Tipe data byte dapat menyimpan bilangan bulat dari -128 hingga 127. Tipe data ini dapat digunakan sebagai pengganti int atau tipe bilangan bulat lainnya untuk menghemat memori ketika Anda yakin bahwa nilainya akan berada di antara -128 dan 127:

        byte myNum = 100;
        System.out.println(myNum);

        // Short
        // Tipe data short dapat menyimpan bilangan bulat dari -32768 hingga 32767:

        short myShort = 5000;
        System.out.println(myShort);


        // Int
        // Tipe data int dapat menyimpan bilangan bulat dari -2147483648 hingga 2147483647. Secara umum, dan dalam tutorial kami, tipe data int adalah tipe data yang lebih disukai ketika kita membuat variabel dengan nilai numerik.

        int myInt = 20;
        System.out.println(myInt);


        // Long
        // Tipe data long dapat menyimpan bilangan bulat dari -9223372036854775808 hingga 9223372036854775807. Tipe data ini digunakan ketika int tidak cukup besar untuk menyimpan nilai. Perhatikan bahwa Anda harus mengakhiri nilai dengan "L":

        long myLong = 15000000000L;
        System.out.println(myLong);

        // Floating point types
        // Anda harus menggunakan Floating point types kapan pun Anda membutuhkan angka dengan desimal, seperti 9,99 atau 3,14515.

        // Tipe data float dan double dapat menyimpan angka pecahan. Perhatikan bahwa Anda harus mengakhiri nilai dengan "f" untuk float dan "d" untuk double:

        float myFloat = 4.88f;
        double myDouble = 9.9999d;

        System.out.println("Float: "+myFloat);
        System.out.println("Double: "+myDouble);

        // Gunakan float atau double?

        // Ketepatan nilai floating point mengindikasikan berapa banyak digit yang dapat dimiliki nilai tersebut setelah titik desimal. Ketepatan float hanya enam atau tujuh digit desimal, sedangkan variabel double memiliki ketepatan sekitar 15 digit. Oleh karena itu, lebih aman menggunakan double untuk sebagian besar perhitungan.

        // Scientific Numbers (Bilangan Ilmiah)
        // Angka floating point juga dapat berupa angka ilmiah dengan "e" untuk menunjukkan pangkat 10:

        float f1 = 10e1f;
        double d1 = 12E4d;

        System.out.println(f1);
        System.out.println(d1);
    }
}
