/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class CetakBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Berbasis Objek";
        buku1.pengarang = "Indrajani";
        buku1.penerbit = "Elexmedia Komputindo";
        buku1.tahun = 2007;
        System.out.println("Buku Pertama");
        System.out.println("Judul : " + buku1.judul);
        System.out.println("Pengarang : " + buku1.pengarang);
        System.out.println("Pengarang : " + buku1.penerbit);
        System.out.println("Tahun : " + buku1.tahun);
        
        
        Buku buku2 = new Buku();
        buku2.judul = "Dasar Pemrograman Java";
        buku2.pengarang = "Abdul Kadir";
        buku2.penerbit = "Andi Offset";
        buku2.tahun = 2004;
        System.out.println("Buku Kedua");
        System.out.println("Judul : " + buku2.judul);
        System.out.println("Pengarang : " + buku2.pengarang);
        System.out.println("Pengarang : " + buku2.penerbit);
        System.out.println("Tahun : " + buku2.tahun);
    }
}

class Buku{
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
}
