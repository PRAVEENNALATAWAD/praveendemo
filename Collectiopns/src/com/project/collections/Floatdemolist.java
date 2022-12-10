package com.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Floatdemolist {
	public static void main(String[] args) {
		List<Float> Averagevalue=new ArrayList<Float>();
		Averagevalue.add(55.36f);
		Averagevalue.add(66.33f);
		Averagevalue.add(66.25f);
		Averagevalue.add(88.36f);
		Averagevalue.add(45.36f);
		Averagevalue.add(77.36f);
		
		
		System.out.println(Averagevalue);
		System.out.println("Iterating the average values using for loop");
		for(Float avg:Averagevalue) {
			System.out.println(avg);
			}
		System.out.println("Iterating the average values using iterator ");
		Iterator<Float> itr=Averagevalue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(Averagevalue);
		System.out.println("Iterating the average values using for loop");
		for(Float avg:Averagevalue) {
			System.out.println(avg);
			}
		List<Float> duplicateaverage=new ArrayList<Float>();
		System.out.println(duplicateaverage.addAll(Averagevalue));
		System.out.println("Average values of students are:"+duplicateaverage);
		
	}

}
