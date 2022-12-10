package com.project.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mapdemo2 {
	public static void main(String[] args) {
		Map<String, Long> mobileno=new HashMap<String, Long>();
		mobileno.put("Praveen", 8951435687l);
		mobileno.put("Rahul", 7483075342l);
		mobileno.put("Vaibhav", 8954436524l);
		mobileno.put("Viraj", 9856325634l);
		mobileno.put("Azhar", 90020202536l);
		mobileno.put("Ganesh",7458585856l);
		mobileno.put("Suguresh", 6589568693l);
		mobileno.put("Veeresh",253653539l);
		
		
		System.out.println(mobileno);
		
		System.out.println("Iterating the phone numbers using foe each loop");
		for(Entry<String, Long> contactlist:mobileno.entrySet()) {
			System.out.println("Name:"+contactlist.getKey()+" Phoneno:"+contactlist.getKey());
		}
		Iterator<Map.Entry<String, Long>> itr=mobileno.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
