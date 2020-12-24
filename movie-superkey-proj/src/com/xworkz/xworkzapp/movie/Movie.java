package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Movie {
public String hero;
public String heroine;
public String language;
public Date date;

public Movie(String hero, String heroine, String language)
{
	this.hero=hero;
	this.heroine=heroine;
	this.language=language;
}
/*
 * public Movie(String hero, String heroine, String language, Date e)
{
	this.hero=hero;
	this.heroine=heroine;
	this.language=language;
	date = e
}
 */
public void toWatchMovie()
{
	System.out.println(" watching movie");
}

}
