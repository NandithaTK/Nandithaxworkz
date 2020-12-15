package com.xworkz.xworkzapp.speaker;

public class Speaker {
	// basic functionalities off speaker
	private static String brandName="Noise"; // static variable
	
	//properties to define functionalities
	private int maxVol=6; 
	private int minVol=0; 
	private int currentVol;
	private boolean connected;
	
	private double price;// instance variables
	private String color;
	private int batteryBackupForHours;
	
	public Speaker(double price, int batteryBackupForHours)
	{
		
		System.out.println("speaker object is created");
		System.out.println("arg 1 : " + this.price);
		System.out.println("arg 2"+ this.batteryBackupForHours );
		this.price=price;
		this.batteryBackupForHours=batteryBackupForHours;
		System.out.println("arg 1 : " + this.price);
		System.out.println("arg 2"+ this.batteryBackupForHours );
	}
	public int getCurrentVol() {
		return currentVol;
	}

	public void setCurrentVol(int currentVol) {
		this.currentVol = currentVol;
	}

	public int getBatteryBackupForHours() {
		return batteryBackupForHours;
	}

	public void setBatteryBackupForHours(int batteryBackupForHours) {
		this.batteryBackupForHours = batteryBackupForHours;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void onOff() {  
		System.out.println("inside on off method");
		if(isConnected()==false) // default value for connected was false so condition is true
		{
			this.connected=true; // now initialising connected as true 
			System.out.println("speaker connected");
		}
		else if(isConnected()==true)
		{
			this.connected=false;
		}
	}
	public boolean isConnected() {
		return connected; // in the begining default value of connected is false and this methos returns false
			}
	
	public static String getBrandName() {
		return brandName;
	}
	public static void setBrandName(String brandName) {
		Speaker.brandName = brandName;
	}
	public int getMaxVol() {
		return maxVol;
	}
	public void setMaxVol(int maxVol) {
		this.maxVol = maxVol;
	}
	public int getMinVol() {
		return minVol;
	}
	public void setMinVol(int minVol) {
		this.minVol = minVol;
	}
	
	public void increaseVolume()
	{
		System.out.println("inside increas vol method");
		if(connected== true) {
			if(this.currentVol<this.maxVol) {
				this.currentVol=this.currentVol+1;
				System.out.println("curent volume is:"+this.currentVol);
			}
			else
			{
				System.out.println("max volume is reached");
			}
		}
		else {
			System.out.println("dadda speaker is not connected");
		}
	}
 public void decreaseVol()
 {
	 System.out.println("inside decrease vol method");
	 if(connected==true) {
		 if(this.currentVol > this.minVol)
		 {
			 System.out.println(this.currentVol);
			 this.currentVol=this.currentVol-1;
			 System.out.println("current vol is"+this.currentVol);
		 }
		 else
		 {
			 System.out.println(" min volum is reached");
		 }
		 
	 }
	 else
	 {
		 System.out.println("gube connect the speaker");
	 }
 }
}
