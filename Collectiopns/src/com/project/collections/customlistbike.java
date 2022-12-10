package com.project.collections;

public class customlistbike {
	int slno;
	int price;
	float average;
	String brand;
	int model;
	long ownerno;
	
	public customlistbike() {
		// TODO Auto-generated constructor stub
	}

	public customlistbike(int slno, int price, float average, String brand, int model, long ownerno) {
		super();
		this.slno = slno;
		this.price = price;
		this.average = average;
		this.brand = brand;
		this.model = model;
		this.ownerno = ownerno;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public long getOwnerno() {
		return ownerno;
	}

	public void setOwnerno(long ownerno) {
		this.ownerno = ownerno;
	}

	@Override
	public String toString() {
		return "customlistbike [slno=" + slno + ", price=" + price + ", average=" + average + ", brand=" + brand
				+ ", model=" + model + ", ownerno=" + ownerno + "]";
	}
	
	
	
	
	

}
