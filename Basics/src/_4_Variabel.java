public class _4_Variabel {
    public static void main(String[] args) {
        // Tipe var: bisa digunakan untuk deklaarasi variabel. (dgn aturan deklarasi + inisialisasi), tipe ini auto deteksi tipe dari value nya

        // Contoh
        var nama = "Benony Gabriel";
        var umur = 19;

        // Print
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);

        // Final / const: tipe yang value nya tidak bisa dimodif/diubah
        final float PHI = 3.14f; // 'f' artinya float
        System.out.println("Nilai phi = "+ PHI);

        String firstName = "Benony ";
        String lastName = "Gabriel";
        String fullName = firstName + lastName;
        System.out.println("My name is "+fullName);


        int x = 3;
        int y = 4;
        int kali = x * y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("x * y = "+kali);

        System.out.println(6 * 5);
        System.out.println("My age is "+(2024 - 2004));

        // Deklarasi multi
        int a = 2, b = 5, c = 2;
        System.out.println(a + b + c);

        int k, l, m;
        k = l = m = 10;
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }
}
