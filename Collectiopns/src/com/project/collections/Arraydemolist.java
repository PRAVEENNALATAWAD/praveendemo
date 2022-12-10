package com.project.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraydemolist {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Praveen");
		names.add("Vaibhav");
		names.add("Veeresh");
		names.add("Suguresh");
		names.add("Ramesh");
		names.add("Sangmesh");
		names.add("Ganesh");
		names.add("Akshay");
		names.add("Rahul");
		
		System.out.println(names.get(5));
		System.out.println(names.contains("Sangamesh"));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.remove(5));
		
		
		
		
		System.out.println(names);
		System.out.println("Iterating the data using for each loop");
		
		for(String str:names) {
			System.out.println(str);
		}
		System.out.println("Iterating the date using iterator interface");
		
		Iterator<String> str=names.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
		}
			
			
			List<String> duplicatenames=new ArrayList<String>();
			System.out.println(duplicatenames.addAll(names));
			System.out.println("List of the students:"+duplicatenames);
		}
		
		
	}


