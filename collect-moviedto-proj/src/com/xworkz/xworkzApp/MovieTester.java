package com.xworkz.xworkzApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MovieTester {

	public static void main(String[] args) {
		MovieDTO mdto1=new MovieDTO("kgf2","Action",5,2.5);
		MovieDTO mdto2=new MovieDTO("dia","emotional-lovebased",5,2);
		MovieDTO mdto3=new MovieDTO("Avengers","Action",4,3);
		MovieDTO mdto4=new MovieDTO("chichore","motivational",5,2.5);
		MovieDTO mdto5=new MovieDTO("uppi2","comedy",4,3);
		
		MovieDTO mdto6=new MovieDTO();
		mdto6.setGenre("drama");
		
		
		Collection<MovieDTO> movieDTOs= new ArrayList();
		movieDTOs.add(mdto1);
		movieDTOs.add(mdto2);
		movieDTOs.add(mdto3);
		movieDTOs.add(mdto4);
		movieDTOs.add(mdto5);
	
		
		Iterator<MovieDTO> iterator = movieDTOs.iterator();
		
		while(iterator.hasNext())
		{
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("comedy")) {
				iterator.remove();
				movieDTOs.remove(movie);
			}
		}
		System.out.println("movie after removing comdey"+ movieDTOs.size());
		
		for(MovieDTO dto:movieDTOs) {
			System.out.println(dto);
		}

	}
	//egg.hasNext();
	
		//MovieDTO dto=egg.next();
		//System.out.println(dto);
		
		//System.out.println(egg.next());
		
		
		//Serializable SER=MovieTester.getNumber();

	//}


//	public static Serializable getNumber() 
//	{
//		return new String("3");
//	}

}
