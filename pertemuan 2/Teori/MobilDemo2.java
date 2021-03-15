/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOVICHEN
 */
public class MobilDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Mobil2 mobil = new Mobil2();
        mobil.hidupkanMobil();
        mobil.setGigi(3);
        
        mobil.warna = "Hijau";
        mobil.tahunProduksi = "2006";
        System.out.println("warna : " + mobil.warna);
        System.out.println("Tahun : " + mobil.tahunProduksi);
        System.out.println("Gigi Sekarang : " + mobil.getGigi());
        
    }
}

public class Mobil2{
    String warna;
    String tahunProduksi;
    int ubahGigi;
    boolean on = false ;
    
    public Mobil2(){
    }
        public void hidupkanMobil(){
            on = true;
        }
        public void matikanMobil(){
            on = false;
        }
        public void setGigi(int tambahGigi){
            ubahGigi = ubahGigi + tambahGigi;
        }
        int getGigi(){
            return ubahGigi;
        }

}