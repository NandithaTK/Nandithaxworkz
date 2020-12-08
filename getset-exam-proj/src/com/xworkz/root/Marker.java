package com.xworkz.root;

public class Marker {
	private String name;
	private String color;
	private double cost;
	private String type;
	
	public Marker()
	{
		System.out.println(" Marker constructor created");
		
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
		}
	
	public String getType()
	{
		return type;
		
	}
	 public void setType(String type)
	 {
		 this.type=type;
	 }
}
