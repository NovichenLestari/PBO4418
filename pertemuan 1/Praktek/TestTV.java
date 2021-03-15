public class TestTV {
	public static void main(String[] args){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(3);
		tv1.setVolume(3); 
                
                TV tv2 = new TV();
                tv2.turnOn();
                tv2.setChannel(30);
                tv2.setVolume(5);

		System.out.println("TV1's Channel: " + tv1.channel 
		+ ", volume level: " + tv1.volumeLevel);
                
                System.out.println("TV2's Channel: " + tv2.channel 
                + ", volume level: " + tv2.volumeLevel);
	}

}

class TV {
	int channel;
	int volumeLevel;
	boolean on = false;

	public TV(){}
	public void turnOn(){
		on = true;
	}
	public void setChannel(int newChannel){
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
		volumeLevel = newVolumeLevel; 
	}
}