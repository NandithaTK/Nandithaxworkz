package com.xworkz.xworkzapp.amazon;

public class AmazonProductOperation {
public ProductDTO[] pDTO; // AmazonDTO array is created and its instance variable is aDTO , instance variable so that it can be used anywr
public int index; // index value is used for accessing the array elements
// initialise the size of array
public AmazonProductOperation(int size) // operation constructor created which have the size as a parameter so that to make the index vaue dynamic
{
	pDTO =new ProductDTO[size]; // here the AmazonDTO object is created which is array type

}


	public  void addProductDetails(ProductDTO dto) // we are adding the farmdto objects so giving that reference, so pass the parametres farm dto only.we have have array of type farmdto
	{
		
		if(dto !=null)
		{
			pDTO[index++]= dto;	 // accessing the whole data by index value
			System.out.println(" adding product details array");
		}
	
		System.out.println(" added product details to array");
	}
	public void displayProductDetails()
	{
		for( ProductDTO pmdto:pDTO) { // for each loop is used to access the segregated data one by one ,for(int i=0; i<pDTO.length;i++){if(pdTO[i]!=null){

			if(pmdto !=null) { // checking the dto in the array is null or not this is null check
				System.out.println(pmdto.getId()+" "+pmdto.getName()+" "+pmdto.getCategory()+" "+pmdto.getPrice()+" ");
			}
			else {
			System.out.println(" please add amazon product details");
		}
		}
	}
}