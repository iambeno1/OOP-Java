package com.manajemen.penerbangan;

public class UjiPenerbangan {
    public static void main(String[] args) {
        ManajemenPenerbangan manajer = new ManajemenPenerbangan();
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Terjadwal"));
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Terjadwal"));
        manajer.tambahPenerbangan(new Penerbangan("II", "o9", "Kisar", "06.00", "Terjadwal"));
    }
}
