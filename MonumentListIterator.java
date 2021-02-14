package Listiteratorexamp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MonumentListIterator {

public static void main(String[] args) {
	List<String> monuments = new ArrayList<String>();
	monuments.add("Taj Mahal");
	
	String charMinar ="CharMinar";
	
	monuments.add(charMinar);
	monuments.add("Statue of Liberty");
	monuments.add("vidhana Soudha");
	monuments.add("Mysore palace");
	
	monuments.add("hampi");
	ListIterator<String> listIterator = monuments.listIterator(4);
	
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	System.out.println(listIterator.previousIndex());
	
	
	System.out.println("*******============*********");
	while(listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
}
}
