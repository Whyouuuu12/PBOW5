/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author hp
 */
public class Motor extends KendaraanDarat {
    private boolean adaBox;
    
    public Motor(String nama, int kecepatanMaks, int jumlahRoda, boolean adaBox) {
        super(nama, kecepatanMaks, jumlahRoda);
        this.adaBox = adaBox;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ada Box: " + (adaBox ? "Ya" : "Tidak"));
    }
}

