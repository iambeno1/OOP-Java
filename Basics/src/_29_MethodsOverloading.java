/*
Dengan kelebihan method overloading, beberapa metode dapat memiliki nama yang sama dengan parameter yang berbeda:

int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

Catatan: Beberapa metode dapat memiliki nama yang sama selama jumlah dan/atau jenis parameternya berbeda.

 */

public class _29_MethodsOverloading {
    public static void main(String[] args) {
        int sumInt = plusMethod(10, 20);
        double sumDouble = plusMethod(30.5, 20.0);

        System.out.println("Int = " + sumInt);
        System.out.println("Double = " + sumDouble);
    }

    // Method overloading : nama sama tapi isinya harus beda.
    static int plusMethod(int num, int num1){
        return num + num1;
    }

    static double plusMethod(double num, double num1){
        return num + num1;
    }
}
