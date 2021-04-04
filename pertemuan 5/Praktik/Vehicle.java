/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Novichen
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
class Test{
    public static void main (String args[]) {
        Vehicle vc= new Vehicle();
        vc.goStraight();
        vc.turnLeft();
        vc.turnRight();
        
        Bicycle by = new Bicycle();
        by.ringBell();
        
        MotorVehicle mv = new MotorVehicle();
        System.out.println(mv.SizeOfEng);
        System.out.println(mv.licencePlate);
        
    }
}
