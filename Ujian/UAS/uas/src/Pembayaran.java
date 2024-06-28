public class Pembayaran extends Transaksi implements BiayaLayanan {

    public Pembayaran(String idTransaksi, double jumlah, String tanggal){
        super(idTransaksi, jumlah, tanggal);
    }

    public void tampilkanDetail(){
        System.out.println("ID Transaksi : " + getIdTransaksi());
        System.out.println("Jumlah : " + getJumlah());
        System.out.println("Tanggal : " + getTanggal());
        System.out.println();
    }

    @Override
    public double hitungBiaya(){
        return 1000 + (getJumlah() * 0.01);
    }

    public void konfirmasiPembayaran(){
        System.out.println("Pembayaran dengan ID " + getIdTransaksi() + " telah dikonfirmasi");
    }
}
