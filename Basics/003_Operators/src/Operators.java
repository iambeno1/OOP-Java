public class Operators {
    public static void main(String[] args) throws Exception {

        /*
        Operator Java
        Operator digunakan untuk melakukan operasi pada variabel dan nilai.
         */
        System.out.println("Java Operators");

        // Contoh
        int x = 100 + 50;
        System.out.println(x);

        int sum1 = 30 + 20;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        // Assigments Operators
        int ass = 10;
        ass += 5;
        System.out.println(ass);

        // Operator Perbandingan
        int num1 = 2;
        int num2 = 8;
        boolean banding = (num1 > num2);
        System.out.println(banding);
        System.out.println(num1 < num2);

        // Operator Logika
        int num = 5;
        System.out.println(num > 3 && num < 10);

    }
}
