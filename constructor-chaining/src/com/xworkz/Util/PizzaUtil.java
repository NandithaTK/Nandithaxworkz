package com.xworkz.Util;
import java.util.Scanner;

import com.xworkz.ConstExample.PizzaHut;
public class PizzaUtil {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the address");
	String address=sc.next();
	System.out.println("enetr the type of pizzas");
	String typeOfPizzas=sc.next();
	System.out.println("enter the price");
	double price=sc.nextDouble();
	sc.close();
	
		PizzaHut piza = new PizzaHut(address, typeOfPizzas,price);
		
		
		
	//	PizzaHut hut= new PizzaHut(499.0); 
System.out.println(piza.address);
	}

}
