package com.manajemen.penerbangan;

import java.util.ArrayList;

public class ManajemenPenerbangan {
    private ArrayList<Penerbangan> penerbangans;
    private static int totalPenerbangan;

    public ManajemenPenerbangan(){
        penerbangans = new ArrayList<>();
    }

    public void tambahPenerbangan(Penerbangan baru){
        penerbangans.add(baru)
        totalPenerbangan++;
    }

    public Penerbangan cariPenerbangan(String kode){
        for (Penerbangan p : penerbangans) {
            if (p.getKodePenerbangan().equals(kode)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Penerbangan> filterPenerbangans(String status){
        ArrayList<Penerbangan> hasil = new ArrayList<>();
        for (Penerbangan p : hasil) {
            if (p.getStatus().equals(status)) {
                hasil.add(p);
            }
        }
        return hasil;
    }

}
