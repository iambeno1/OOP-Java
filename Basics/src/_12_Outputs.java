import java.util.Scanner;

public class _12_Outputs {
    public static void main(String[] args) {
        /*println -> utk cetak baris dengan enter*/
        /*print -> utk cetak baris tdk pake enter*/

        // Buat input
        Scanner input = new Scanner(System.in);

        // Test output dengan println vs print
        // println -> input dibawah prakata
        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();

        // print -> input disamping prakata
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // hasil
        System.out.println("Nama kamu " + nama + " umur kamu " + umur);

        input.close();
    }
}
