package com.xworkz.util;

import java.util.Date;

import com.xworkz.Rocket.Rocket2;



public class RocketUtil2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rocket2 rock = new Rocket2();
		rock.setName("PSLV");
		rock.setId(535);
		rock.setDate(new Date());
				
		System.out.println(rock.getName()+" "+rock.getId()+""+rock.getDate()+"");
	}

// example on using getter and setters when we use access modifiers that is private, private usage makes us to help for encapsulation
}
