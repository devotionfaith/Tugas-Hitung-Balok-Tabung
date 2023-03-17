/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasHitungBalokTabung;

/**
 *
 * @author Acer
 */
public class Balok extends PersegiPanjang  implements MenghitungRuang{
    float lp;
    float tinggi;
    float volume;
    public Balok(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public void menghitung_volume(){
        volume= luas*tinggi;
        System.out.println("Volume Balok = " + volume);
    }

    @Override
    public void menghitung_luas_permukaan(){
       lp = 2*(panjang*lebar + lebar*tinggi + tinggi*panjang);
       System.out.println("Luas Permukaan Balok = " + lp);
    }
    
}
