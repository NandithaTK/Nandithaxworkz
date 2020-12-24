package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.fruit.Fruit;
import com.xworkz.xworkzapp.fruit.Mango;

public class FruitUtil {

	public static void main(String[] args) {

		Fruit frut = new Mango(); // upcasting parent reference child objet
		Mango mang = (Mango)frut; // downcasting - child refernce to parent object
		
		frut.color=" yellow";
		frut.price= 25;
		System.out.println(frut.color+" "+frut.price+" ");
		frut.makeHappy(); //casting here the child functionality overrides the parent functionality. 

	}

}
