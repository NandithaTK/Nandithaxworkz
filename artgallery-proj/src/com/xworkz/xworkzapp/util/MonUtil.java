package com.xworkz.xworkzapp.util;

import java.util.Scanner;
import com.xworkz.xworkzapp.monuments.MonOperation;
import com.xworkz.xworkzapp.monuments.MonumentDTO;

public class MonUtil {
public static void main(String[] args) {
	
		//MonumentDTO mone= new MonumentDTO("Mg250",599.9);
				//MonumnetDTO mtwo= new MonumentDTO("Mag290",9999.9);
				Scanner sc = new Scanner(System.in); // user input at runtime
				System.out.println("enter the monumnet array size");
			int size = sc.nextInt();
			MonOperation op = new MonOperation(size); 
				for(int i=0;i<size;i++) { // for loop for size
					MonumentDTO dto = new MonumentDTO(); 
					System.out.println("enter the "+ (i+1)+"monumnet details"); // i+1 bcos i starts with 0,if i is 1 then +1 is not required
					System.out.println("enter the monument id");
					String id= sc.next();
					System.out.println("enter the monumnet cost");
					double price= sc.nextDouble();
					dto.setMonId(id);
					dto.setPrice(price);
					op.addMonumentDetails(dto);
					}
				//MonOperation op = new MonOperation(2);
				//op.addProductDetails(mone); // read the data
				//op.addProductDetails(mtwo);
				op.displayDetails();
				sc.close();
	}

}
