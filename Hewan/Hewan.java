/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbow5;

/**
 *
 * @author hp
 */
    public class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis);
    }

    public void suara() {
        System.out.println("Hewan ini mengeluarkan suara.");
    }
}
