package com.xworkz.xworkzApp.util;

import java.util.Scanner;

import com.xworkz.xworkzApp.farm.FarmDTO;
import com.xworkz.xworkzApp.farm.Operation;

public class FarmUtil {

	public static void main(String[] args) {
		/*FarmDTO farmOne = new FarmDTO("black","2 acre","peanuts"); // adding or creating the data in the array
		FarmDTO farmtwo = new FarmDTO("red","1 acre","cotton"); // this is the add coding the ddata
		FarmDTO farmThree = new FarmDTO("brown", "5 acre","sunflower");
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the farm size");
		int size = sc.nextInt();
		Operation operation = new Operation(size);
		for(int i=0;i<size;i++)
		{
			FarmDTO dto = new FarmDTO();
			System.out.println("enter the "+ (i+1)+"farm details");
			System.out.println("enter the type of soil");
			String typeOfSoil= sc.next();
			System.out.println("enter the area");
			String area= sc.next();
			System.out.println("enter the type of crop");
			String typeOfCrop= sc.next();
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
			operation.addFarmDetails(dto);
		}
		//operation.addFarmDetails(farmOne); // read the data
		//operation.addFarmDetails(farmtwo);
		//operation.addFarmDetails(farmThree);
		operation.showAllFarmDetails();
		System.out.println("enter the crop u want to search");
		String typeOfCrop=sc.next();
		operation.searchByCrop(typeOfCrop);
		System.out.println("enter the area to be searched");
		String area=sc.next();
		operation.searchByArea(area);
		System.out.println("enter the type of soil u want to search");
		String soil=sc.next();
		operation.searchByTypeOfSoil(soil);
		sc.close();

	}

}
