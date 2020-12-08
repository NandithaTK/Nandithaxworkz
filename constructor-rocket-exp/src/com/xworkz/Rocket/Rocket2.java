
package com.xworkz.Rocket;

import java.util.Date;

// user defined package 


public class Rocket2 {

	private String name;
	private int id;
	private Date date;
	
	public Rocket2()
	{
		System.out.println(" Rocket created");
	}
	
		
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}

