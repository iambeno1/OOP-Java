public class Transfer extends Transaksi implements BiayaLayanan, Verifikasi {

    public Transfer(String idTransaksi, double jumlah, String tanggal){
        super(idTransaksi, jumlah, tanggal);
    }

    public void tampilkanDetail(){
        System.out.println("ID Transaksi : " + getIdTransaksi());
        System.out.println("Jumlah : " + getJumlah());
        System.out.println("Tanggal : " + getTanggal());
    }

    @Override
    public double hitungBiaya(){
        return 2500 + (getJumlah() * 0.005);
    }

    @Override
    public boolean verifikasiTransaksi(){
        if(getJumlah() > 0){
            return true;
        }else{
            return false;
        }
    }

    public void konfirmasiTransfer(){
        System.out.println("Transfer dengan ID " + getIdTransaksi() + " telah dikonfirmasi");
    }
}
