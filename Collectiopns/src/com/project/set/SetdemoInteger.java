package com.project.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetdemoInteger {
	public static void main(String[] args) {
		Set<Integer> Jersyno=new HashSet<Integer>();
		Jersyno.add(25);
		Jersyno.add(36);
		Jersyno.add(28);
		Jersyno.add(25);
		Jersyno.add(29);
		Jersyno.add(30);
		
		
		System.out.println(Jersyno);
		System.out.println("Iterating the jersey no using for loop");
		for(Integer no:Jersyno) {
			System.out.println(no);
		}
		System.out.println("Iterating the jersey no using iterator");
		Iterator<Integer> itr=Jersyno.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<Integer> duplicatejerseyno=new HashSet<Integer>();
		System.out.println(duplicatejerseyno.addAll(Jersyno));
		System.out.println("Jersey no students is:"+duplicatejerseyno);
	}

}
