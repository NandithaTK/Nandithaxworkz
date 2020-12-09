package com.dev.devapp.Util;

import com.dev.devapp.forest.KabiniForest;
import com.dev.devapp.forest.SahyadriForest;

public class ForestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KabiniForest kf = new KabiniForest();
		kf.setArea("5000 sqt");
		kf.setNoOfSpecies(520);
		kf.setRegion("Mysore");
		System.out.println(kf.getArea()+" "+ kf.getNoOfSpecies()+ " " + kf.getRegion()+" ");
		
		SahyadriForest sf=new SahyadriForest();
		sf.setArea("3000 sqt");
		sf.setNoOfSpecies(250);
		sf.setRegion("Shivamogga");
		System.out.println(sf.getArea()+ " "+ sf.getNoOfSpecies()+ " "+ sf.getRegion()+ " ");
		
	}

}
