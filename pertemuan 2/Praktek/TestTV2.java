/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOVICHEN
 */
public class TestTV2 {

  
//    @param args the command line arguments
    int channel; 
//    make channel variable
    int volumeLevel;
//    make volumeLevel variable
    boolean on;
//     make on variable
    
//  object construction
    TestTV2() { 
    } 
    
//    Tv condition On
    void turnOn(boolean on) {
        on = true;
    }
//    Tv condition Off
    void turnOff(boolean on) {
        on = false;
    }
//    indicator to set Channel
    void setChannel(int newChannel){
        channel = newChannel;
    }
//    indicator to set Volume
    void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
//      channel was up
    void channelUp() {
        ++channel ;
    }
//    channel was down
    void channelDown() {
        --channel;
    }
//    volume was up
    void volumeUp() {
        ++volumeLevel;
    }
//    volume was down
    void volumeDown() {
        --volumeLevel ;
    }
    
class manusia {
        String nama;
        boolean punyaTV;
        
        manusia () {
        }
        public manusia(String nama) {
            this.nama = nama;
        }
        public String namasaya(){
            return nama;
        }
        void beliTV( TestTV2 tvku){
            punyaTV = true;
            System.out.println(punyaTV);
        }
        void jualTV(){
            punyaTV = false;
            System.out.println(punyaTV);
        }
        boolean ckTV(){
            return punyaTV;
        }
    }
   
    public static void main(String args[]) {
        // TODO code application logic here
        TestTV2 tv1 = new TestTV2();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TestTV2 tv2 = new TestTV2();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume is " + tv2.volumeLevel);

        
    }
}