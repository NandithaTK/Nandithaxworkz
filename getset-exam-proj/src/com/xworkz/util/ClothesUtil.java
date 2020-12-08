package com.xworkz.util;

import com.xworkz.root.Clothes;

public class ClothesUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes cloth=new Clothes();
		cloth.setType("jeans");
		cloth.setGender("female");
		cloth.setPrice(499.9);
		cloth.setBrandName("Max");
		System.out.println(cloth.getType()+" "+cloth.getGender()+" "+cloth.getPrice()+" "+cloth.getbrandName()+ " ");
				
		
	}

}
