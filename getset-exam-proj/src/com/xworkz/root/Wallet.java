package com.xworkz.root;

public class Wallet {
	private String name;
	private double cost;
	private String brand;
	
	
	public Wallet()
	{
		System.out.println("wallet constructor created");
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost=cost;
		
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
}

