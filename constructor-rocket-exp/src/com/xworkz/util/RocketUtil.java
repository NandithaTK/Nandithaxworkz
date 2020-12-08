package com.xworkz.util;

import java.util.Date;

import com.xworkz.Rocket.Rocket;

public class RocketUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rocket rock = new Rocket("PSLV", 525);
	rock.date= new Date(); // Date is a class type so to use it anywhere in the class we need to create object.
		
		System.out.println(rock.id+" "+rock.name+" "+rock.date+" ");
	}

	
}
	
	
	
	
	
	
	
	
	
	