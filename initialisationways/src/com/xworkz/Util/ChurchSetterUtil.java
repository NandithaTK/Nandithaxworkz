package com.xworkz.Util;
import com.xworkz.Setterinitialisation.Church;
public class ChurchSetterUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Church chsu = new Church();
		chsu.setName("Hudson");
		chsu.setAddress("Corporation");
		chsu.setnoOfFathersAndSisters(25);
		System.out.println(chsu.getName()+" " + chsu.getAddress()+ " " +chsu.getnoOfFathersAndSisters()+" ");
	}

}

