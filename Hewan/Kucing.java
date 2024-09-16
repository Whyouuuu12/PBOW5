/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbow5;

/**
 *
 * @author hp
 */
class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah seekor kucing.");
        super.tampilkanInfo();
    }

    @Override
    public void suara() {
        System.out.println("MIIIIAAAAAWWWWW!");
    }
}