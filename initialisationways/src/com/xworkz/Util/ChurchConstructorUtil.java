package com.xworkz.Util;

import com.xworkz.Constructorinitialisation.ChurchConstructor;

public class ChurchConstructorUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChurchConstructor ch = new ChurchConstructor("St.peters", "kerala", 25); // here we are initializing values using parameterized constructor
		System.out.println(ch.getName()+" "+ch.getAddress()+" "+ch.getNoOfFathersAndSisters()+" ");
	}

}
