/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOVICHEN
 */
public class testTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Manusia man1 = new Manusia("NOVI");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        man1.jualSemuaTV();
    }
}

class Manusia{
    String nama;
    boolean punyaTV;
    
    Manusia(){
    }
    public Manusia(String nama){
        this.nama = nama;
    }
    public String namaSaya(){
        return nama;
    }
    void beliTV(TV tvku){
        punyaTV = true;
        System.out.println(punyaTV);
    }
    void jualSemuaTV(){
        punyaTV = false;
        System.out.println(punyaTV);
    }
    boolean cekTV(){
        return punyaTV;
    }
}

class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }  
    
        public void nyalakan(){
            on = true;
        }
        
        public void matikan(){
            on = false;
        }
        
        public void setChannel (int ChannelBaru){           
            channel = ChannelBaru;
        }
        
        public void setVolume (int VolumeLevelBaru){           
            volumeLevel = VolumeLevelBaru;
        }
        
        public void channelNaik(){
            channel++;
        }
        
        public void channelTurun(){
            channel--;
        }
        
        public void volumeNaik(){
            volumeLevel++;
        }
        
        public void volumeTurun(){
            volumeLevel--;
        }
}
