/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbow5;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Catty");
        Hewan anjing = new Anjing("Blackie");

        kucing.tampilkanInfo();
        kucing.suara();

        anjing.tampilkanInfo();
        anjing.suara();
    }
}
