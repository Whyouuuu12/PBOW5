/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author hp
 */
public class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    public KendaraanDarat(String nama, int kecepatanMaks, int jumlahRoda) {
        super(nama, kecepatanMaks);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah kendaraan darat.");
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
