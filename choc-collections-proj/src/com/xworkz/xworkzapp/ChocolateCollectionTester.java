package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;

public class ChocolateCollectionTester {
public static void main(String[] args) {
	String cadbury="Dairymilk";
	String nestle = "kitkat";
	String parle="kiss me";
	Collection chocolates = new ArrayList();
	chocolates.add(cadbury);
	chocolates.add(nestle);
	chocolates.add(parle);
	
	System.out.println("Total elements: "+ chocolates.size());
	
	chocolates.remove(parle);
	System.out.println("Total elements after removing an element: " + chocolates.size());
	
	chocolates.add(null);
	System.out.println("Total elements: " + chocolates.size());
	
	
}
}
