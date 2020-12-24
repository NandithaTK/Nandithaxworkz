package com.xworkz.xworkzApp.farm;

public class Operation {
	public FarmDTO[] farmDTOs; // to perform operations so array, 
	public int index; // to acess any array we need to acess using index
	
	public Operation (int size)
	{
		farmDTOs= new FarmDTO[size]; // two objects created one is operation another is Farmdto
	}
	
	public  void addFarmDetails(FarmDTO farm)
	{
		System.out.println(" adding farm details");
		farmDTOs[index++]= farm;
		System.out.println(" added farm details");
	}
	public void showAllFarmDetails()
	{
		for(FarmDTO farmDTO:farmDTOs) {
			if(farmDTO !=null) { // checking the dto in the array is null or not this is null check
				System.out.println(farmDTO.getTypeOfSoil()+" "+farmDTO.getArea()+" "+farmDTO.getTypeOfCrop()+" ");
			}
			else {
			System.out.println(" please add farm details");
	}			
		}
	}
	 public void searchByCrop(String crop)
	 {
		 for(int i=0;i<farmDTOs.length;i++)
		 {
			 if(farmDTOs!=null)
			 {
				 if(farmDTOs[i].getTypeOfCrop().equals(crop) )
				 {
						System.out.println(farmDTOs[i]+" " + farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop()+" "); // if(farmDTOd[i].getTypeOfCrop().equals(crop))
				 }
				 else
				 {
					 System.out.println(" *****");
				 }
			 }
		 }
		 }
		 public void searchByTypeOfSoil(String soil)
		 {
			 for(int i=0;i<farmDTOs.length;i++)
			 {
				 if(farmDTOs!=null)
				 {
					 if(farmDTOs[i].getTypeOfCrop().equals(soil) )
					 {
							System.out.println(farmDTOs[i]+" " + farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop()+" "); // if(farmDTOd[i].getTypeOfCrop().equals(crop))
					 }
					 else
					 {
						 System.out.println(" *****");
					 }
					 }
			 }
					 
				 
			 }
			 public void searchByArea(String area)
			 {
				 for(int i=0;i<farmDTOs.length;i++)
				 {
					 if(farmDTOs!=null)
					 {
						 if(farmDTOs[i].getTypeOfCrop().equals(area) )
						 {
								System.out.println(farmDTOs[i]+" " + farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop()+" "); // if(farmDTOd[i].getTypeOfCrop().equals(crop))
						 }
						
					 }
				 }
		 
	 }
}
