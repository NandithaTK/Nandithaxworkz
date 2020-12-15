package com.xworkz.xworkzapp.speaker;

public class SpeakerUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speaker spk = new Speaker(2000.00,9);
		System.out.println(spk.getBatteryBackupForHours());
		System.out.println(spk.isConnected());
		spk.increaseVolume();
		//spk.onOff();
		spk.increaseVolume();
		spk.increaseVolume();
		spk.onOff();
		spk.increaseVolume();
		spk.increaseVolume();
		spk.decreaseVol();
		spk.increaseVolume();
		spk.onOff();
		spk.increaseVolume();
		spk.onOff();
		spk.increaseVolume();
		spk.decreaseVol();
		spk.onOff();
		spk.decreaseVol();
		spk.onOff();
		spk.increaseVolume();
		spk.increaseVolume();
		spk.decreaseVol();
		spk.decreaseVol();
	}

}
