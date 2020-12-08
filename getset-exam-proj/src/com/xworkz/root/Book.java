package com.xworkz.root;

public class Book {
	private String name;
	private int isbnid;
	private double cost;
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public int getIsbnid()
	{
		return isbnid;
	}
	public void setIsbnid(int isbnid)
	{
		this.isbnid=isbnid;
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
	this.cost=cost;	
	}
}
