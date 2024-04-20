package com.manajemen.penerbangan;

import java.util.ArrayList;

public class UjiPenerbangan {
    public static void main(String[] args) {
        ManajemenPenerbangan manajer = new ManajemenPenerbangan();
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Terjadwal"));
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Terjadwal"));
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Delayed"));

        System.out.println("Total Penerbangan : " + ManajemenPenerbangan.getTotalPenerbangan());

        Penerbangan p = manajer.cariPenerbangan("II");

        if(p != null){
            System.out.println("Penerbangan ditemukan : " + p.getKodePenerbangan() + " - " + p.getStatus());
        }else{
            System.out.println("Penerbangan tidak ditemukan!");
        }

        ArrayList<Penerbangan> delayed = manajer.filterPenerbangans("Delayed");
        System.out.println("Penerbangan yang delayed : ");
        for(Penerbangan d : delayed){
            System.out.println(d.getKodePenerbangan() + " - " + d.getKotaAsal() + " ke " + d.getKotaTujuan());
        }
    }
}
