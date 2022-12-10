package com.project.map;

import java.util.HashMap;
import java.util.Map;


public class Tester {
	public static void main(String[] args) {
		Map<Code, String> details=new HashMap<Code, String>();
		details.put(new Code(25, "Duke"),"Bajaj");
		details.put(new Code(36, "Duke360"), "Bajaj");
		details.put(new Code(55, "KTM"), "Bajaj");
		details.put(new Code(60, "Splendor"), "Hero");
		details.put(new Code(65, "HFDeluxe"), "Hero");
		details.put(new Code(45, "Aviator"), "Honda");
	    details.put(new Code(0, null), null);
	    
	    
	    System.out.println(details);
	    System.out.println("Iterating the values using for loop");
	    for(Map.Entry<Code, String> entry:details.entrySet()) {
	    	System.out.println("Entry:"+entry.getKey() +"Value:"+entry.getValue());
	    }
	}

}
