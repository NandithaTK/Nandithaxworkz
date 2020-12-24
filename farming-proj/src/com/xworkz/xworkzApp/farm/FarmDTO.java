package com.xworkz.xworkzApp.farm;

public class FarmDTO {
	// farm dto is the one which contains only data
	private String typeOfSoil;
	private String area;
	private String typeOfCrop;
	
	/*public FarmDTO(String typeOfSoil, String area, String typeOfCrop) // here string typeOfSoil is also called as parameters, this is inside paranthesis so oarameterd 
	{
		super();
		// i = 10; this s local variables , total 4 variables local,  instancce,static and paramters 
		this.typeOfSoil = typeOfSoil;
		this.area = area;
		this.typeOfCrop = typeOfCrop;
	}*/

	public String getTypeOfSoil() {
		return typeOfSoil;
	}

	public void setTypeOfSoil(String typeOfSoil) {
		this.typeOfSoil = typeOfSoil;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTypeOfCrop() {
		return typeOfCrop;
	}

	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	
	
	
}