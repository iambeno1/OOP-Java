package com.toko;

public class TesToko {
    public static void main(String[] args) {
        TokoBuku toko = new TokoBuku();
        toko.tambahBuku(new Buku("Java Pemula", "Jhon Doe", 150000.0, 50));
        toko.tambahBuku(new Buku("Advanced Java", "Rian Lot", 250000.0, 30));

        System.out.println("Total buku saat ini: " + TokoBuku.getTotalBuku());
        toko.jualBuku("Java Pemula", 10);
        toko.tampilkanStokBatas(15);
    }
}
