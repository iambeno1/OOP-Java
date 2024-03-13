/*
Methods pada Java sama dengan fungsi/prosedur pada C++
- tipe void : tdk mengembalikan niilai
- <data types> : mengembalikan nilai
 */
public class _0_Intro {
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
