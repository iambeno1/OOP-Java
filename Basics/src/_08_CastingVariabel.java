public class _08_CastingVariabel {
    public static void main(String[] args) {
        /*  Pengecoran tipe adalah ketika Anda menetapkan nilai dari satu tipe data primitif ke tipe lain.

        Di Java, ada dua jenis casting:

        Widening Casting (automatically) - mengubah tipe yang lebih kecil ke ukuran tipe yang lebih besar
            byte -> short -> char -> int -> long -> float -> double
        
        Narrowing Casting (manually) - mengubah tipe yang lebih besar ke tipe ukuran yang lebih kecil
            double -> float -> long -> int -> char -> short -> byte
        */


        // Widening Casting
        // Widening Casting dilakukan secara otomatis ketika melewatkan tipe ukuran yang lebih kecil ke tipe ukuran yang lebih besar:
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("myInt : " + myInt);
        System.out.println("Casting to Double : " + myDouble);


        // Narrowing Casting
        // Narrowing casting harus dilakukan secara manual dengan menempatkan tipe dalam tanda kurung di depan nilai:
        double myDouble1 = 5.78d;
        int myInt1 = (int) myDouble1; // Manualy casting double to int

        System.out.println("myDouble1 : " + myDouble1);
        System.out.println("Casting to int : " + myInt1);

    }
}
