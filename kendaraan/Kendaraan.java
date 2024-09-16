/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author hp
 */
public class Kendaraan {
    protected String nama;
    protected int kecepatanMaks;

    public Kendaraan(String nama, int kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama + ", Kecepatan Maks: " + kecepatanMaks + " km/jam");
    }
}
