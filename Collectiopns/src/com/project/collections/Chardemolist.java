package com.project.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Chardemolist {
	public static void main(String[] args) {
		List<Character> Firstletter=new ArrayList<Character>();
		Firstletter.add('l');
		Firstletter.add('p');
		Firstletter.add('o');
		Firstletter.add('l');
		Firstletter.add('k');
		Firstletter.add('m');
		Firstletter.add('b');
		
		
		System.out.println("Iterating the letters using for loop");
		for(Character chr:Firstletter) {
			System.out.println(chr);
			
	   System.out.println("Iterating the letters using iterator");
	   Iterator<Character> itr=Firstletter.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
		   
		   List<Character> duplicateletters=new ArrayList<Character>();
		   System.out.println(duplicateletters.addAll(Firstletter));
		   System.out.println("First letters of all the names are:"+duplicateletters);
	   }
		}
		
	
	
	
	

}
