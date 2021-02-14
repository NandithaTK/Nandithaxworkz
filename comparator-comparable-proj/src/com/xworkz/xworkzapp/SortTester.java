package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTester {

	public static void main(String[] args) {
		

		List<String> garageToolList=new ArrayList();
		garageToolList.add("spanner");
		garageToolList.add("Gun");
		garageToolList.add("Cuttinplier");
		garageToolList.add("hammer");
		garageToolList.add("Nut");
		garageToolList.add("bolt");
		garageToolList.add("jack");
		garageToolList.add("air pump");
		garageToolList.add("screw Driver");
		garageToolList.add("Mechanic");
		
		
		
		GarageComparatorExample comprr=new GarageComparatorExample();
		Collections.sort(garageToolList,comprr);
		
		for (String toolSorted : garageToolList) {
			System.out.println(toolSorted);
		}
		
	}
}
