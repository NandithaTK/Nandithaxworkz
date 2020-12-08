package com.xworkz.util;

import com.xworkz.root.Tap;

public class TapUtil {

	public static void main(String a[])
	{
		Tap tt = new Tap();
		tt.setBrand(" jaquar");
		tt.setCode(521236);
		tt.setCost(120.0);
		System.out.println(tt.getBrand()+" "+tt.getCode()+" "+tt.getCost()+" ");
		
	}
	
}
