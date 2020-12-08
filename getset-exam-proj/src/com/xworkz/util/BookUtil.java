package com.xworkz.util;

import com.xworkz.root.Book;

public class BookUtil {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book book=new Book();
		
		book.setName("Java book");
		book.setIsbnid(12546);
		book.setCost(299.2);
		System.out.println(book.getName()+" " + book.getIsbnid()+" "+book.getCost()+"");
	}

}
