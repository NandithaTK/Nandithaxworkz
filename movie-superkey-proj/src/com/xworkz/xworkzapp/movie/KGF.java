package com.xworkz.xworkzapp.movie;

public class KGF extends Movie{
	public KGF(String hero, String heroine, String language) {
		super(hero,heroine,language);
	}
	
	/*
	 public KGF(String hero, String heroine, String language, Date e) {
		super(hero,heroine,language,e);
	}
	 */
	public void toEnjoy(String language)
	{
		System.out.println("entering the KGF class method");
		super.language=language;
		System.out.println(language);
		super.toWatchMovie();
		System.out.println(" end of KGF class enjoy method");
	}
	
	{
		String hero="Yatharv";
		System.out.println(hero);
	}

}
