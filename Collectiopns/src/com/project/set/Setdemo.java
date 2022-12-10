package com.project.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setdemo {
	public static void main(String[] args) {
		Set<String> dailyneeds=new HashSet<String>();
		dailyneeds.add("Brush");
		dailyneeds.add("Paste");
		dailyneeds.add("Groceries");
		dailyneeds.add("Water");
		dailyneeds.add("Mobile");
		dailyneeds.add("Laptop");
		System.out.println(dailyneeds.contains("Mobile"));
		System.out.println(dailyneeds.hashCode());
		System.out.println(dailyneeds.isEmpty());
		System.out.println(dailyneeds.size());
		
		
		
		
		System.out.println(dailyneeds);
		System.out.println("Iterating the needs using for loop");
		for(String str:dailyneeds) {
			System.out.println(str);
		}
		System.out.println("Iterating the things using iterator");
		Iterator<String> itr=dailyneeds.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<String> duplicateneeds=new HashSet<String>();
		System.out.println(duplicateneeds.addAll(dailyneeds));
		System.out.println("The daily neede things are:"+duplicateneeds);
		
		
	}

}
