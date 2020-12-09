package com.dev.devapp.Util;

import com.dev.devapp.Industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String a[]) {
		// steelIndustry ind = new SteelIndustry("Construction",25,"Whitefield");
		SteelIndustry ind = new SteelIndustry();
		ind.setArea("com street");
		ind.setNoOfWorkers(30);
		ind.setType("Manufacturing");
		System.out.println(ind.getType()+" "+ind.getArea()+" "+ind.getNoOfWorkers()+" ");
		
	}

}
