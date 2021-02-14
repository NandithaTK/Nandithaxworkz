package com.xworkz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTester {
	public static void main(String[] args) {

		List<String> garageToolList=new ArrayList();
		garageToolList.add("spanner");
		garageToolList.add("screw Driver");
		garageToolList.add("cutting plier");
		garageToolList.add("hammer");
		garageToolList.add("nut");
		garageToolList.add("bolt");
		garageToolList.add("jack");
		garageToolList.add("air pump");
		garageToolList.add("gun");
		garageToolList.add("mechanic");
		
		
		
		Collections.sort(garageToolList); // sort is present in collections not collection.
		// is collection utility claas?  utility class have helper methods. have static methods.
		for (String toolSorted : garageToolList) {
			System.out.println(toolSorted);
		}
		
		
	}

}
