package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeachComparatrTester {

	public static void main(String[] args) {
		
		BeachDTO beach1=new BeachDTO("Om", 43,3);
		
		BeachDTO beach2=new BeachDTO("Maple", 4,56);
		
		BeachDTO beach3=new BeachDTO("KAApu", 70,32);
		
		BeachDTO beach4=new BeachDTO("Marvante", 7,7);
		
		List<BeachDTO> beachDTOs=new ArrayList<BeachDTO>();
		beachDTOs.add(beach1);
		beachDTOs.add(beach2);
		beachDTOs.add(beach3);
		beachDTOs.add(beach4);
		
		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
		
		BeachNoOfResortComparatorExample comparator=new BeachNoOfResortComparatorExample ();
		Collections.sort(beachDTOs,comparator);
		
 		System.out.println("After Sorting the List is");
 		
 		for (BeachDTO beachDTOszzz : beachDTOs) {
			System.out.println(beachDTOszzz);
		}
	}
}
