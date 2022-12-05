package com.project.customarray;

public class Car {
	int price;
	String colour;
	int average;
	String carname;
	int model;
	boolean iscarlooksgood;
	
	public Car() {
	
		
	}



	public Car(int price, String colour, int average, String carname, int model, boolean iscarlooksgood) {
		super();
		this.price = price;
		this.colour = colour;
		this.average = average;
		this.carname = carname;
		this.model = model;
		this.iscarlooksgood = iscarlooksgood;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public int getAverage() {
		return average;
	}



	public void setAverage(int average) {
		this.average = average;
	}



	public String getCarname() {
		return carname;
	}



	public void setCarname(String carname) {
		this.carname = carname;
	}



	public int getModel() {
		return model;
	}



	public void setModel(int model) {
		this.model = model;
	}



	public boolean isIscarlooksgood() {
		return iscarlooksgood;
	}



	public void setIscarlooksgood(boolean iscarlooksgood) {
		this.iscarlooksgood = iscarlooksgood;
	}



	@Override
	public String toString() {
		return "Car [price=" + price + ", colour=" + colour + ", average=" + average + ", carname=" + carname
				+ ", model=" + model + ", iscarlooksgood=" + iscarlooksgood + "]";
	}
	
	
	
	
	
	
	

}