package com.xworkz.Rocket;

import java.util.Date;

// user defined package 


public class Rocket {

	public String name; 
	public int id;
	public Date date;
	// public Date date = new Date (); we can also create object for date class like this to use it
	
	public Rocket()
	{
		System.out.println(" Rocket created");
	}
	
	public Rocket(String name, int id)
	{
	this.name=name;
	this.id=id;
	}
	
	
}

