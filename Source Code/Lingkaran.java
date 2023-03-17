/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasHitungBalokTabung;

/**
 *
 * @author Acer
 */

public class Lingkaran implements MenghitungBidang{
    double jari;
    double luas;
    double keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void menghitung_luas() {
         luas = 3.14 * jari * jari;
        System.out.println("Luas Lingkaran = "+luas);
    }

    @Override
    public void menghitung_keliling() {
        keliling = 3.14 * 2 * jari;
        System.out.println("Keliling Lingkaran = "+keliling);
    }
    
 
}
