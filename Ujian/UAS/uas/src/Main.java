import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transaksi> transaksis = new ArrayList<>();
        transaksis.add(new Pembayaran("P01", 200000, "2024-06-01"));
        transaksis.add(new Transfer("T01", 500000, "2024-06-02"));
        transaksis.add(new Pembayaran("P02", 150000, "2024-06-03"));
        transaksis.add(new Transfer("T02", 750000, "2024-06-04"));


        for(Transaksi i : transaksis){
            i.cetakTransaksi();
        }
    }
}
