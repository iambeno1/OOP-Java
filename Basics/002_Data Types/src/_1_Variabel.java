public class _1_Variabel {
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
    }
}
