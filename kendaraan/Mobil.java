/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author hp
 */
public class Mobil extends KendaraanDarat {
    private int JumlahPintu;
    public Mobil(String nama, int kecepatanMaks, int jumlahRoda, int JumlahPintu) {
        super(nama, kecepatanMaks, jumlahRoda);
        this.JumlahPintu = JumlahPintu;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + JumlahPintu);
    }
}

