
package tugasHitungBalokTabung;
import java.util.Scanner;

public class main {

     private static boolean CekValue(String value){
 
        try {
 
                Integer.valueOf(value);
 
                return true;
 
            } catch (NumberFormatException ex)
 
            {
 
                return false;
 
            }
 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String repeat;
        do{
            System.out.println("Pilih Volume yang akan dihitung !");
            System.out.println("A. Balok");
            System.out.println("B. Tabung");
            System.out.println("C. Keluar");
            System.out.println();
                    
            System.out.print("Masukan pilihan anda : "); 
            String choice = input.nextLine();
            
            switch(choice.toLowerCase()){
                case "a" -> {
                    System.out.println("Menghitung Volume Balok");
                    System.out.print("Masukan Panjang : ");
                    String panjang= input.nextLine();
                    System.out.print("Masukan Lebar : ");
                    String lebar = input.nextLine();
                    System.out.print("Masukan Tinggi : ");
                    String tinggi = input.nextLine();

                    if(CekValue(panjang ) && CekValue(lebar) && CekValue(tinggi)){
                        int p = Integer.parseInt(panjang);
                        int l = Integer.parseInt(lebar);
                        int t = Integer.parseInt(tinggi);
                        Balok balok = new Balok(p,l,t);
                        balok.menghitung_luas();
                        balok.menghitung_keliling();
                        balok.menghitung_volume();
                        balok.menghitung_luas_permukaan();
                        break;
                    }else{

                        System.out.println("Nilai yang anda masukan harus angka");
                        break;

                    }
                 }

                case "b" -> {
                    System.out.println("Menghitung Volume Tabung");

                    System.out.print("Masukkan Jari-Jari: ");

                    String jari = input.nextLine();

                    System.out.print("Masukkan Tinggi : ");

                    String tinggi = input.nextLine();

                    if(CekValue(jari) && CekValue(tinggi)){

                        int r = Integer.parseInt(jari);

                        int t = Integer.parseInt(tinggi);

                        Tabung tabung = new Tabung(r, t);
                        tabung.menghitung_luas();
                        tabung.menghitung_keliling();
                        tabung.menghitung_volume();
                        tabung.menghitung_luas_permukaan();
                        break;
                    }else{

                        System.out.println("Nilai yang anda masukan harus integer");
                        break;
                    }
                 }

                case "c" -> {
                    break;
                }
                default -> {
                    System.out.println("WARNING : Menu Tidak Ada");
                    break;
                }
            } 
            System.out.println("=================================================");
            System.out.print("Ulang Menu? : ");
            repeat = input.nextLine();
            
        }while("y".equals(repeat) || "Y".equals(repeat) );
    }
}
   
