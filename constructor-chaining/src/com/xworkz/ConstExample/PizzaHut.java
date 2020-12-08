package com.xworkz.ConstExample;

public class PizzaHut 
{

	// instance members or states or attributes or properties
	
	public String address;
	public String typeOfPizzas; 
	public double price;
	
	
	// constructor chaining
	
	public PizzaHut()
	{
		this("jayanagar","pastapizza",599.0);
		System.out.println("ending zero parametrised const");
		// this is now used as method 
	}
	
	public PizzaHut(String address, String typeOfPizzas, double price) // here public we are using because so that the constructor is visible or accesble to another package
	{
		System.out.println("inside two parametrised const");
		this.address=address;
		this.typeOfPizzas=typeOfPizzas;
		this.price=price;
		System.out.println("ending two parametrised const");
		// this keyword is not mandatory but when the local variables are same as instance members to avoid conflicts so we use this keyword
	}
	
	public PizzaHut(double price)
	{
		
		this(); // here we r calling another constructor with this method
		System.out.println("inside one parametrised const");
		System.out.println(this.price);
		this.price=price;
		System.out.println("ending one parametrised const");
	}


}
