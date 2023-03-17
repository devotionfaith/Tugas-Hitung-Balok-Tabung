/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasHitungBalokTabung;

/**
 *
 * @author Acer
 */
public class Tabung extends Lingkaran implements MenghitungRuang{

    double tinggi;
    double volume;
    double lp;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void menghitung_volume() {
        volume = luas*tinggi;
        System.out.println("Volume Tabung = " + volume);
    }

    @Override
    public void menghitung_luas_permukaan() {
       lp = 2*3.14*jari*jari + (2*3.14*jari*tinggi);
        System.out.println("Luas Permukaan Tabung = "+ lp);
    }

}
