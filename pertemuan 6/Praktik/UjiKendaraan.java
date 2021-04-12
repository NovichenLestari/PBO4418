/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktik;

/**
 *
 * @author ACER
 */
class Vehicle {
    double Speed;
    String Color;
    
    public Vehicle(){
    }
    public void goStraight(){
        System.out.println("Maju..");
    }
    public void turnLeft(){
        System.out.println("Belok Kiri..");
    }
    public void turnRight(){
        System.out.println("Belok Kanan..");
    }
}
class Bicycle extends Vehicle{
    public Bicycle(){
    }
    public void ringBell(){
        System.out.println("Kring..Kring..");
    }
}

class MotorVehicle extends Vehicle{
    int SizeOfEng = 1;
    String licencePlate = "H 1 IDN";
    
    public MotorVehicle(){
    }
    public MotorVehicle(int SizeOfEng, String licencePlate){
    }
    public int getSizeofEngine(){
        return SizeOfEng;
    }
    public String getLicencePlate(){
        return licencePlate;
    }
}
class Motorcycle extends MotorVehicle {
    private int numGear = 0;
    
    public Motorcycle(){
    }
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    public int getGear(){
        return numGear;
    }
}
class Car extends MotorVehicle{
    private boolean seatbelt = false;
    
    public Car (){
    }
    public void setSeatBelt (int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }else if(seatbelt == 0){
            this.seatbelt = false;
        }
    }
    boolean getSeatBelt(){
        return this.seatbelt;
    }
}
public class UjiKendaraan {
public static void kendaraanmelaju(Vehicle vehikel){
        vehikel.goStraight();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();
        Vehicle vehikell = new Vehicle();
        Car car = new Car();
        
        System.out.println("---------------");
        System.out.println(sepeda.Speed);
        System.out.println(sepeda.Color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        System.out.println("---------------");
        
        System.out.println(mtr.Speed);
        System.out.println(mtr.Color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.SizeOfEng);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        
        System.out.println("---------------");
        
        vehikell.goStraight();
        vehikell.turnLeft();
        vehikell.turnLeft();
        
        System.out.println();
        
        System.out.println("============");
        
        car.setSeatBelt(0);
        System.out.println("seatbelt: " + car.getSeatBelt());
        car.setSeatBelt(1);
        System.out.println("seatbelt: " + car.getSeatBelt());
        
        System.out.println("============");
        
        System.out.println();
        kendaraanmelaju(new Vehicle());
        kendaraanmelaju(new Bicycle());
        kendaraanmelaju(new MotorVehicle());
        kendaraanmelaju(new Car());
    }
}
