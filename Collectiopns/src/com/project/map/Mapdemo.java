package com.project.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapdemo {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Praveen");
		map.put(2, "Vaibhav");
		map.put(3,"Telgu");
		map.put(4, "Akshay");
		map.put(5,"Viraj");
		map.put(6,"Karthik");
		map.put(7, "Chandu");
		map.put(8, "Abhya");
		map.put(9, "Rahul");
		System.out.println(map.containsKey(5));
		System.out.println(map.hashCode());
		System.out.println(map.isEmpty());
		System.out.println(map.get(6));
		System.out.println(map.remove(5, "Viraj"));
		System.out.println(map.remove(9));
		System.out.println(map.keySet());
		System.out.println(map.containsValue("Telgu"));
		
		
		
		
		System.out.println(map);
		System.out.println("Getting the keys and values using for each loop");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
		//	System.out.println(entry);
			System.out.println("key:"+entry.getKey()+" Value:"+entry.getValue());
		}
		System.out.println("Getting the keys and values using iterator");
		Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
