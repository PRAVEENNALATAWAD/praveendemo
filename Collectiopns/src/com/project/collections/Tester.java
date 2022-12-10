package com.project.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		customlistbike Bike=new customlistbike(25, 150000, 60.2f, "KTM", 2016,8951435687l);
		customlistbike Bike1=new customlistbike(26,20000, 68.3f, "Honda",2018,785643569l);
		customlistbike Bike2=new customlistbike(27, 200000, 85.3f, "Hero",2020, 8956325692l);
		customlistbike Bike3=new customlistbike(28, 360000, 38.56f, "Suzuki", 2020, 8747040579l);
		customlistbike Bike4=new customlistbike(29, 300000,65.3f, "BMW", 2021, 7856235649l);
		
		
		List<customlistbike> Bikedetails=new ArrayList<customlistbike>();
		Bikedetails.add(Bike);
		Bikedetails.add(Bike1);
		Bikedetails.add(Bike2);
		Bikedetails.add(Bike3);
		Bikedetails.add(Bike4);
		
		
		
		
		System.out.println(Bikedetails);
		System.out.println("Iterating the bike list using for loop");
		for(customlistbike ctlb:Bikedetails) {
			System.out.println(ctlb);
		}
		System.out.print("Iterating the bike list using iterator");
		Iterator<customlistbike> itr=Bikedetails.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
