package com.xworkz.util;

import com.xworkz.root.Marker;

public class MarkerUtil {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker mark = new Marker();
		mark.setName("Kores White board marker");
		mark.setColor("Black");
		mark.setType("permanent marker");
		mark.setCost(59.9);
		System.out.println(mark.getName()+" "+mark.getColor()+""+mark.getCost()+" "+mark.getType()+" ");
	}

}
