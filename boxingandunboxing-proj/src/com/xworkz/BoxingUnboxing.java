package com.xworkz;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer age = 24;// auto boxing

		Double salary = new Double(450);
		double convertedSalary = salary;// auto un boxing

		List<Integer> ageList = new ArrayList<Integer>();
		int veereshsAge = 23;
		int rohanAge = 24;
		int sushmaAge = 23;
		ageList.add(veereshsAge);//23
		ageList.add(rohanAge);//24
		ageList.add(sushmaAge);//23
		List<Integer> copyOfAgeList=new ArrayList<Integer>();
		copyOfAgeList.addAll(ageList);
		copyOfAgeList.add(24);
		copyOfAgeList.add(23);
		copyOfAgeList.add(25);
		copyOfAgeList.add(22);
		
		System.out.println("copyOfAgeList"+copyOfAgeList.size());
		List<Integer> removAgeList=new ArrayList<Integer>();
		removAgeList.add(23);
		removAgeList.add(22);
		removAgeList.add(21);
		boolean constainall=copyOfAgeList.containsAll(removAgeList);
		System.out.println("constainall"+constainall);
		copyOfAgeList.removeAll(removAgeList);
		System.out.println("copyOfAgeList after removeall"+copyOfAgeList.size());

		/*
		 * for (Integer integer : ageList) { copyOfAgeList.add(integer); }
		 */
		System.out.println(copyOfAgeList.size());
		System.out.println(copyOfAgeList);
		
		
	}
}
