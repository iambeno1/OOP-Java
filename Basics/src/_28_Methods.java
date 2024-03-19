/*
Methods pada Java sama dengan fungsi/prosedur pada C++
- tipe void : tdk mengembalikan niilai
- <data types> : mengembalikan nilai

public class Main {
  static void myMethod() {
    // code to be executed
  }
}

Contoh Penjelasan
myMethod() adalah nama metode
statis berarti metode tersebut adalah milik kelas Main dan bukan objek dari kelas Main. Anda akan mempelajari lebih lanjut tentang objek dan cara mengakses metode melalui objek di tutorial ini.
void berarti metode tersebut tidak memiliki nilai balik. Anda akan mempelajari lebih lanjut tentang nilai balik nanti di bab ini
 */

public class _28_Methods {

    // Main program
    public static void main(String[] args) throws Exception {
        // panggil method
        myMethod();
        System.out.println(myMethod2(10, 20));
        System.out.println(myMethod3());
        System.out.println(nilai(99,98,100,97,99));
        // System.out.println(helo()); // error kalo gini, karena method yg dibuat tdk static
        System.out.println(helo());
        System.out.println(days(6));
        System.out.println("Kamis adalah hari ke " + days("Kamis") + " dalam seminggu");
        System.out.println(factorial(5));
        System.out.println(5*4*3*2*1);
        System.out.println(factorial(4));
        System.out.println(4*3*2*1);
        loop(10);
        loop(100);
        // loop(10000); // terjadi error stackoverflow disini
    }

    // buat method dgn tipe void
    static void myMethod(){
        System.out.println("Test method in java!");
    }
    
    // buat method dgn tipe return
    static int myMethod2(int a, int b){
        return a + b;
    }

    static String myMethod3(){
        return "Hello java";
    }

    // variable argument (int... <nama var>)
    static int nilai(int... values){
        int total = 0;
        for(int val : values){
            total += val;
        }

        int rataRata = total / values.length;
        return rataRata;
    }

    // Kalo method yg tdk pake static itu dia tdk bisa dipanggil di main yg static. intinya static dgn static.
    // String helo(){
    //     return "hai";
    // }
    static String helo(){
        return "hai";
    }

    static String days(int numOfDays){
        switch (numOfDays) {
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            case 4:
                return "Kamis";
            case 5:
                return "Jumad";
            case 6:
                return "Sabtu";
            case 7:
                return "Minggu";
            default:
                return null;
        }
    }

    // Method overloading adalah kemampuan membuat method dengan nama yg sama. dengan syarat dalamannya harus beda (mau itu parameter, tipe data, atau apapun itu lah)

    static int days(String nameOfDay){
        switch (nameOfDay) {
            case "Senin":
                return 1;
            case "Selasa":
                return 2;
            case "Rabu":
                return 3;
            case "Kamis":
                return 4;
            case "Jumad":
                return 5;
            case "Sabtu":
                return 6;
            case "Minggu":
                return 7;
            default:
                return 0;
        }
    }

    // Recursive method adalah kemampuan method memanggil dirinya sendiri
    static int factorial(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorial(value - 1);
        }
    }

    // recursive error stack overflow
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop ke-" + (value - 1));
            loop(value - 1);
        }
    }
}
