package com.toko;

import java.util.ArrayList;

public class TokoBuku {
    private ArrayList<Buku> bukus;
    private static int totalBuku = 0;

    public TokoBuku(){
        bukus = new ArrayList<>();
    }

    public void tambahBuku(Buku bukuBaru){
        bukus.add(bukuBaru);
        totalBuku++;
    }

    public void jualBuku(String judul, int jumlah){
        for(Buku b : bukus){
            if(b.getJudul().equals(judul) && b.getStok() >= jumlah){
                b.setStok(b.getStok() - jumlah);
                break;
            }
        }
    }

    public void tampilkanStokBatas(int batas){
        System.out.println("Daftar buku dengan stok diatas " + batas + ": ");
        for(Buku b : bukus){
            if(b.getStok() > batas){
                System.out.println(b.getJudul() + " - Stok : " + b.getStok());
            }
        }
    }

    public static int getTotalBuku(){
        return totalBuku;
    }
}
