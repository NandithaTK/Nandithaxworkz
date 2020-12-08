package com.xworkz.StringUtil;


public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Aarthi";
		String s2="Aarthi";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); // equals method is always look in content 
		
		
		String s3="AAArthi";
		String s4="aaarthi";
		String s5 = new String("AAArthi");
		System.out.println(s3==s5); // == symbol will always look into the reference variableor adress
		
		
		String s7 = " nanditha";
		String s8 = new String("nanditha");
		System.out.println(s7==s8);
		
		s
	}

}
