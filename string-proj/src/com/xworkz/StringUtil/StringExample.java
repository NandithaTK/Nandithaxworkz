package com.xworkz.StringUtil;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Aarthi";
		String s2="AArthi";
		
		String s3= "Aarti&Avi";
		String s4="Manjula";
		
		System.out.println(s1);
		System.out.println(s1+"&Avi");
		StringBuilder builder = new StringBuilder("Aarti");
		builder.append("&Avi");
		
		System.out.println(s1.contains(s2));
	
	System.out.println(s1.equals(s2));// we can also use toUppercase, toLowercase methods
	//we can also use equalsIgnorecase method so to compre string irrespective of case of characters
	//
	
	String s8= "                       AArti&AVi";
	System.out.println(s8);
	System.out.println(s8.trim()); // to delete the  white space in string
	
	StringBuilder s9 = new StringBuilder("nanditha");
	System.out.println(s9.reverse());
	
	System.out.println(s4.concat(s2)); // concatenation

	System.out.println(s1.indexOf("i"));
	System.out.println(s1.matches("a"));
	
		String s11= new String("AArthi kalpana nanditha pooja nazia ");
		String s12= "Nanditha";
	System.out.println(s11.trim().matches(s12));
	
	System.out.println(s2.isEmpty()); // space is also data inside string
	
	String s15 = new String ("My name is Nanditha TK Anand ");
	// split method return string array
	String[] finals15 = s15.split(" ");
	for(String string: finals15) {
		System.out.println(string);
	}
	
	System.out.println(s12.indexOf("a"));
	}
	// also try contains, length of value 
}
