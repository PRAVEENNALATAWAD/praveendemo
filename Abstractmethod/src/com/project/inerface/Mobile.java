package com.project.inerface;

public class Mobile implements Samsung,Iphone {

	@Override
	public void chatting() {
		System.out.println("Mobile.chatting()");
		
	}

	@Override
	public void onlinepayments() {
		System.out.println("Mobile.onlinepayments()");
		System.out.println("can do online payments");
		
	}

	@Override
	public void cantalk() {
		System.out.println("Mobile.cantalk()");		
	}

	@Override
	public void takepicture() {
		System.out.println("Mobile.takepicture()");
		
	}

	@Override
	public void goodcameraquality() {
		System.out.println("Mobile.goodcameraquality()");	
		
	}

	@Override
	public void goodRAM() {
		System.out.println("Mobile.goodRAM()");	
		
	}

	@Override
	public void playgames() {
		System.out.println("Mobile.playgames()");	
		
	}

	@Override
	public void trackmobile() {
		System.out.println("Mobile.trackmobile()");	
		
	}

}
