public abstract class Transaksi {
    private String idTransaksi;
    private double jumlah;
    private String tanggal;

    Transaksi(String idTransaksi, double jumlah, String tanggal){
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public abstract void tampilkanDetail();

    public void cetakTransaksi(){
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Tanggal : " + tanggal);
        System.out.println();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getTanggal() {
        return tanggal;
    }
}
