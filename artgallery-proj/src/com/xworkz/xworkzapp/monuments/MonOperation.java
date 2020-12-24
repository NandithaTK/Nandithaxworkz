package com.xworkz.xworkzapp.monuments;

public class MonOperation {

	public MonumentDTO[] mDTO; 
	public int index; 
	// initialise the size of array
	public MonOperation(int size) // operation constructor created which have the size as a parameter
	{
		mDTO =new MonumentDTO[size]; // here the DTO object is created which is array type

	}

	public  void addMonumentDetails(MonumentDTO dto) //adding the or seggregating the id, price
		{   
			
			if(dto !=null)
			{
				mDTO[index++]= dto;	 // accessing the whole data by index value
				System.out.println(" adding monument details array");
			}
		
			System.out.println(" added monument details to array");
		}
		public void displayDetails()
		{
			for(MonumentDTO mmdto:mDTO) { // for each loop is used to access the segregated data one by one 
				if(mmdto !=null) { // checking the dto in the array is null or not this is null check
					System.out.println(mmdto.getMonId()+" "+mmdto.getPrice()+" " );
				}
				else {
				System.out.println(" please add amazon product details");
			}
			}
		}
	}

  