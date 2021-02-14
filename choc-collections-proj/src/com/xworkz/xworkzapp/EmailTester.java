package com.xworkz.xworkzapp;

import java.util.ArrayList;

public class EmailTester {

	public static ArrayList removeDup(ArrayList email) {
		ArrayList mails = new ArrayList();
		for (Object mailList : email) {
			if (!mails.contains(mailList)) {
				mails.add(mailList);
			}
		}
		return mails;
	}

	public static void main(String[] args) {
		String email1 = "nanditha.tk@gmail.com";
		String email2 = "13nanditha.tk@gmail.com";
		String email3 = "nandithatk.Xworkz@gmail.com";
		String email4 = "pavithra.22@gmail.com";
		String email5 = "anandbs17@gmail.com";
		String email6 = "bharath.tk@gmail.com";
		String email7 = "suma@gmail.com";
		String email8 = "poo.28@gmail.com";
		String email9 = "naz.05@gmail.com";
		String email10 = "manju.nsm@gmail.com";
		String email11 = "rakshith01@gmail.com";
		String email12 = "divya.shree@gmail.com";
		String email13 = "xworkz.odc@gmail.com";
		String email14 = "xworkz.odc.btm@gmail.com";
		String email15 = "nishchal.jagdesh@gmail.com";
		String email16 = "sri.nidhik21@gmail.com";
		String email17 = "siddu.jamagav01@gmail.com";
		String email18 = "meghna.rakee@gmail.com";
		String email19 = "nanditha.tk@gmail.com";
		String email20 = "divya.shree@gmail.com";

		ArrayList emails = new ArrayList();
		emails.add(email1);
		emails.add(email2);
		emails.add(email3);
		emails.add(email4);
		emails.add(email5);
		emails.add(email6);
		emails.add(email7);
		emails.add(email8);
		emails.add(email9);
		emails.add(email10);
		emails.add(email11);
		emails.add(email12);
		emails.add(email13);
		emails.add(email14);
		emails.add(email15);
		emails.add(email16);
		emails.add(email17);
		emails.add(email18);
		emails.add(email19);
		emails.add(email20);
		emails.add(email1);

		System.out.println("duplicated values in arraylist:" + emails);

		System.out.println(emails.size());
		ArrayList newEmails = removeDup(emails);
		System.out.println("arrayList without dulicate values:" + newEmails);
		System.out.println(newEmails.size());

	}
}
