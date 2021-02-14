package com.xworkz.xworkzapp;

import java.util.Comparator;

public class GarageComparatorExample  implements Comparator<String> {

		@Override
		public int compare(String arg0, String arg1) {
			
			return arg1.compareTo(arg0);
		}

	}

