package com.project.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bytedemolist {
	public static void main(String[] args) {
		List<Long> numbers=new ArrayList<Long>();
		numbers.add(8951435687l);
		numbers.add(235656862l);
		numbers.add(7483075342l);
		numbers.add(536235365l);
		numbers.add(7456892356l);
		numbers.add(864523568l);
		numbers.add(7856565892l);
		

			
	   System.out.println("Iterating the numbers using iterator");
	   Iterator<Long> itr=numbers.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
		   
		   Collections.sort(numbers);
		   System.out.println("Iterating the numbers using for loop");
			for(Long num:numbers) {
				System.out.println(num);
	   }
		}
		
		
		
		
	

}
