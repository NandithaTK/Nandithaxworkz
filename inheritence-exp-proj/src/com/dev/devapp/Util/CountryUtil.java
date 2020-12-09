package com.dev.devapp.Util;

import com.dev.devapp.country.IndiaCountry;
import com.dev.devapp.country.SrilankaCountry;

public class CountryUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndiaCountry inc = new IndiaCountry(32,250,"newDelhi");
		System.out.println(inc.noOfStates+" "+inc.noOfLanguages+" "+inc.capital+" ");
		inc.noOfStates=32;
		inc.noOfLanguages=253;
		inc.capital="NewDelhi";
		System.out.println(inc.noOfLanguages+" "+ inc.capital+" "+inc.noOfStates+" ");
		SrilankaCountry sc= new SrilankaCountry(8,2,"Colombo");
		System.out.println(sc.noOfStates+" "+ sc.noOfLanguages+" "+ sc.capital+" ");
		
	}

}
