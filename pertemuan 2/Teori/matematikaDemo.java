/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class matematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        matematika Mtk = new matematika();
        
        Mtk.tambah(20,20);
        Mtk.kurang(10,5);
        Mtk.kali(10, 20);
        Mtk.bagi(20,2);
        
    }
}

class matematika{
    int hasil;
    
    void tambah(int a, int b){
        System.out.println("Hasil dari " + a +" ditambah " +
        b + " adalah " +(a+b));
    }
    void kurang(int a, int b){
        System.out.println("Hasil dari " + a +" dikurangi " +
        b + " adalah " +(a-b));
    }
    void kali(int a, int b){
        System.out.println("Hasil dari " + a +" dikali " +
        b + " adalah " +(a*b));
    }
    void bagi(int a, int b){
        System.out.println("Hasil dari " + a +" dibagi " +
        b + " adalah " +(a/b));
    }

}
