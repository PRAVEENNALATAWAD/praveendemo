package com.project.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Mapdemo1 {
	public static void main(String[] args) {
		Map<String, Float> results=new HashMap<String, Float>();
		results.put("Praveen", 7.75f);
		results.put("Telgu", 8.31f);
		results.put("Viraj", 9.12f);
		results.put("Vaibhav", 9.0f);
		results.put("Azhar", 9.1f);
		results.put("Rahul", 9.12f);
		results.put("Akshay", 8.56f);
		results.put("Abhishek", 7.75f);
		results.put("Chandru", 4.5f);
		
		System.out.println(results);
		
		System.out.println("Getting the results using for each loop");
		for(Map.Entry<String, Float> CGPA:results.entrySet()) {
			System.out.println("key:"+CGPA.getKey()+" Value:"+CGPA.getValue());
			
		}
		Iterator<Map.Entry<String , Float>> itr=results.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
