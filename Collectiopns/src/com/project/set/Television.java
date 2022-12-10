package com.project.set;

public class Television {
	int slno;
	String name;
	int model;
	String colour;
	int Size;
	
	
	public Television() {
		// TODO Auto-generated constructor stub
	}


	public Television(int slno, String name, int model, String colour, int size) {
		super();
		this.slno = slno;
		this.name = name;
		this.model = model;
		this.colour = colour;
		Size = size;
	}


	public int getSlno() {
		return slno;
	}


	public void setSlno(int slno) {
		this.slno = slno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getSize() {
		return Size;
	}


	public void setSize(int size) {
		Size = size;
	}


	@Override
	public String toString() {
		return "Television [slno=" + slno + ", name=" + name + ", model=" + model + ", colour=" + colour + ", Size="
				+ Size + "]";
	}
	
	

}
