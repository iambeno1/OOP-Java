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
    // buat method dgn tipe void
    static void myMethod(){
        System.out.println("Test method in java!");
    }

    static int myMethod2(int a, int b){
        return a + b;
    }

    static String myMethod3(){
        return "Hello java";
    }

    // Main program
    public static void main(String[] args) throws Exception {
        // panggil method
        myMethod();
        System.out.println(myMethod2(10, 20));
        System.out.println(myMethod3());
    }
}
