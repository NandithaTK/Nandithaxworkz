package com.xworkz.Setterinitialisation;

public class Church
{
// using setter to initialize data
	
	private String name;
	private String address;
	private int noOfFathersAndSisters;
	
	public Church()
	{
		System.out.println("church object is created");
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getnoOfFathersAndSisters()
	{
		return noOfFathersAndSisters;
		
	}
	public void setnoOfFathersAndSisters(int noOfFathersAndSisters)
	{
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}
}
