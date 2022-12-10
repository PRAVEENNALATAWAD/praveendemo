package com.project.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Television TV=new Television(25, "Onida", 2020, "Black", 25);
		Television TV1=new Television(20, "LG", 2019, "SILVER", 36);
		Television TV2=new Television(26, "SAMSUNG", 2018, "GREY", 38);
		Television TV3=new Television(23, "SONY", 2016, "Blue", 42);
		
		
		
		Set<Television> Details=new HashSet<Television>();
		Details.add(TV);
		Details.add(TV1);
		Details.add(TV2);
        Details.add(TV3);
        
        
        System.out.println(Details);
        System.out.println("Iterating the details of TV using for loop");
        for(Television Tv:Details) {
        	System.out.println(Tv);
        }
        System.out.println("Iterating the details of tv using Iterator");
        Iterator<Television> itr=Details.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
