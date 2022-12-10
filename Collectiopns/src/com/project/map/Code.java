package com.project.map;

public class Code {
	private int average;
	private String Bikename;
	
	
	public Code() {
		// TODO Auto-generated constructor stub
	}


	public Code(int average, String bikename) {
		super();
		this.average = average;
		Bikename = bikename;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public String getBikename() {
		return Bikename;
	}


	public void setBikename(String bikename) {
		Bikename = bikename;
	}


	@Override
	public String toString() {
		return "Code [average=" + average + ", Bikename=" + Bikename + "]";
	}
	

}
