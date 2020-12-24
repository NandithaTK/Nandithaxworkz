package com.xworkz.xworkzapp.util;

import java.util.Date;

import com.xworkz.xworkzapp.movie.KGF;

public class MovieUtil {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		KGF kgf= new KGF("Yash","Srinidi shetty","Kannada");
		// KGF kgf= new KGF("Yash","Srinidi shetty","Kannada", new Date());
		//System.out.println(kgf.hero+" "+kgf.heroine+" "+kgf.language+" "+kgf.date);
		kgf.date= new Date();
		System.out.println(kgf.hero+" "+kgf.heroine+" "+kgf.language+" "+kgf.date+" ");
		kgf.toEnjoy("English");
	}

}
