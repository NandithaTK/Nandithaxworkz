package com.dev.devapp.country;

public class Country {
	public int noOfStates;
	public int noOfLanguages;
	public String capital;
	
	public Country(int noOfStates, int noOfLanguages,String capital)
	{
		this.noOfStates=noOfStates;
		this.noOfLanguages=noOfLanguages;
		this.capital=capital;
			}
 public void develop()
 {
	 System.out.println(" developing country");
 }
}
