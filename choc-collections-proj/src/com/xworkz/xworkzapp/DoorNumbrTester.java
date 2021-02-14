package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;

public class DoorNumbrTester {

	public static void main(String[] args) {
		Collection<Long> doorNos = new ArrayList();

		doorNos.add(115L);
		doorNos.add(420l);
		doorNos.add(840l);
		doorNos.add(420l);
		doorNos.add(100l);
		doorNos.add(31l);
		doorNos.add(420l);
		doorNos.add(31l);
		doorNos.add(729l);
		doorNos.add(370l);
		doorNos.add(370l);
		
		
		// convert to []
		// iterator

		Collection<Long> temprorayDoorNos = new ArrayList<Long>();
		//tempDoorNos.addAll(doorNos);
		temprorayDoorNos.add(729l);
		temprorayDoorNos.add(370l);
		temprorayDoorNos.add(370l);
		Collection<Long> doorNos2 = new ArrayList();
		doorNos2.add(370l);
		
		temprorayDoorNos.removeAll(doorNos2);
		
	System.out.println(temprorayDoorNos.size());
	}

	}


