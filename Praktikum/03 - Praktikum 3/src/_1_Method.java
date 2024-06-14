public class _1_Method {
    // ========== Main Program ==========
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        sayHelloWorld();
        sayHello("Benony ", "Gabriel");
        System.out.println(sum(100, 200));
        sayCongrats("Beno", 90,90,100,100);
        sayHello();
        sayHello("Beno");
        System.out.println(factorial(5));
        // System.out.println();
    }

    // ========== MY METHOD ============

    // Contoh method
    static void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    // Method dengan parameter
    static void sayHello(String fname, String lname){
        System.out.println("Hello " + fname + lname);
    }

    // Method return value
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    // Fungsi say Congrats
    static void sayCongrats(String name, int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finnaliValue = total / values.length;
        if(finnaliValue >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        }else{
            System.out.println("Anda gagal");
        }
    }

    // Method overloading
    static void sayHello(){
        System.out.println("Hello Beno");
    }
    
    static void sayHello( String fname){
        System.out.println("Hello " + fname);
    }

    // Rekrusif Method
    static int factorial(int value){
        if (value == 1) {
            return 1;
        }else{
            return value * factorial(value - 1);
        }
    }

}
