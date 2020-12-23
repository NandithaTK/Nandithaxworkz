package com.xworkz.xworkzapp.util;
import java.util.Scanner;
import com.xworkz.xworkzapp.amazon.ProductDTO;
import com.xworkz.xworkzapp.amazon.AmazonProductOperation;

public class AmazonUtil {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AmazonDTO aone= new AmazonDTO("AA250","kurthi","Cloths",599.9);
		//AmazonDTO atwo= new AmazonDTO("ag250","coconuts","food items",9.9);
		//AmazonDTO athree= new AmazonDTO("Au860","iron box","electronic",899.9);
		//AmazonDTO afour= new AmazonDTO("Am60","kajal","makeup products",199);
		Scanner sc = new Scanner(System.in); // user input at runtime
		System.out.println("enter the Amazon array size");
	int size = sc.nextInt();
	AmazonProductOperation op = new AmazonProductOperation(size); // object creation for operation class
		for(int i=0;i<size;i++) { // for loop for size
			ProductDTO dto = new ProductDTO(); //amazondto object created & its data members are accessed
			System.out.println("enter the "+ (i+1)+"product details"); // i+1 bcos i starts with 0,if i is 1 then +1 is not required
			System.out.println("enter the id");
			String id= sc.next();
			System.out.println("enter the product name");
			String name= sc.next();
			System.out.println("enter the product category");
			String category= sc.next();
			System.out.println("enter the product cost");
			double price= sc.nextDouble();
			dto.setId(id);
			dto.setName(name);// to access setname of farm dto so wwe are creating the object of it at line 18 to acess the data inside that
			dto.setCategory(category);
			dto.setPrice(price);
			op.addProductDetails(dto);// here the dto contains the "amazondto" object and its dto reference variable information stored and addproduct details are in operatin
		}
		//AmazonProductOperation op = new AmazonProductOperation(5);
		//op.addProductDetails(aone); // read the data
		//op.addProductDetails(atwo);
	     //op.addProductDetails(athree);
		//op.addProductDetails(afour);
		op.displayProductDetails();
	sc.close();
	}

}

