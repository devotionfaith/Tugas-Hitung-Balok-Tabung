/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasHitungBalokTabung;

/**
 *
 * @author Acer
 */
public class PersegiPanjang implements MenghitungBidang {
    float panjang;
    float lebar;
    float luas;
    float keliling;
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void menghitung_luas() {
         luas = panjang*lebar;
         System.out.println("Luas Persegi Panjang = "+ luas);
    }

    @Override
    public void menghitung_keliling() {
        keliling= 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }

    
}

