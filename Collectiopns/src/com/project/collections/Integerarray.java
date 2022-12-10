package com.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Integerarray {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(36);
		numbers.add(33);
		numbers.add(55);
		numbers.add(65);
		numbers.add(45);
		numbers.add(23);
		numbers.add(69);
		numbers.add(11);
		numbers.add(66);
		System.out.println(numbers.contains(55));
		System.out.println(numbers.hashCode());
		System.out.println(numbers.isEmpty());
		System.out.println(numbers.size());
		System.out.println(numbers.get(5));
		System.out.println(numbers.indexOf(65));
		
		
		System.out.println(numbers);
		
		System.out.println("Iterating the numbers by using iterator interface");
		Iterator<Integer> itr=numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
			
			Collections.sort(numbers);
			System.out.println("Iterating the numbers by using for each loop");
			for(Integer num:numbers) {
				System.out.println(num);
			}
				
				
				List<Integer> duplicatenumbers=new ArrayList<Integer>();
				System.out.println(duplicatenumbers.addAll(numbers));
				System.out.println("Elements in the container:"+duplicatenumbers);
			
		}
		
		
	}


