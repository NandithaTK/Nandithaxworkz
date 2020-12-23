package com.xworkz.xworkzapp.amazon;

public class ProductDTO {
	//Product DTO: which means it contains only the data and which doesnt have any logic. this example contains the addition and display options only this is an example of crud operations.
private String id;
private String name;
private String category;
private double price;
/*public ProductDTO(String id, String name, String category, double price)
{
	this.id=id;
	this.name=name;
	this.category=category;
	this.price=price;
}*/

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
