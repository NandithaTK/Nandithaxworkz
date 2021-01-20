package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;

public class FoodItems {
	public static void main(String[] args) {
		String northIndian = "palakpanner";
		String southIndian = "masala dose";
		String italian = "creamy pasta";
		String chats = "masal puri";
		String sweets = "rasmalai";

		Collection foodItems = new ArrayList();
		boolean added = false;
		added = foodItems.add(northIndian);
		System.out.println(added);
		added = foodItems.add(southIndian);
		System.out.println(added);
		added = foodItems.add(italian);
		System.out.println(added);
		added = foodItems.add(chats);
		System.out.println(added);
		added = foodItems.add(sweets);
		System.out.println(added);

		boolean contains = foodItems.contains(italian);
		System.out.println("food items has :" + contains);
	}

}
