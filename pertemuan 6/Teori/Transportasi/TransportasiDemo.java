/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

/**
 *
 * @author Novichen
 */
import Transportasi.Mobil;
import Transportasi.Bicycle;
public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil car = new Mobil();
        car.Mobil();
        car.goStraight();
        car.turnLeft();
        car.turnRight();
        System.out.println("=========");
        
        Bicycle By = new Bicycle();
        By.Bicycle();
        By.ringBell();
        System.out.println("=========");
    }
    
}
