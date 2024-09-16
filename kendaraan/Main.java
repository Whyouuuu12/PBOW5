/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 180, 4, 4);
        Motor sepedaMotor = new Motor("Yamaha NMAX", 120, 2, true);

        mobil.tampilkanInfo();
        sepedaMotor.tampilkanInfo();
    }
}
