/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbow5;

/**
 *
 * @author hp
 */
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah seekor anjing.");
        super.tampilkanInfo();
    }

    @Override
    public void suara() {
        System.out.println("Woof Woof!");
    }
}
