public class ManajerKeuangan {
    
    public void prosesTransaksi(Transaksi transaksi){
        if(transaksi instanceof Pembayaran){
            Pembayaran p = (Pembayaran) transaksi;
            p.hitungBiaya();
            p.konfirmasiPembayaran();
        }

        if(transaksi instanceof Transfer){
            Transfer t = (Transfer) transaksi;
            t.verifikasiTransaksi();
            t.konfirmasiTransfer();
        }
    }
}
