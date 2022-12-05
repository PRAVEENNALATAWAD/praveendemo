package com.project.Arraycontainer;

public class Arraystring {
	public static void main(String[] args) {
		String strcontainer[]=new String[5];
		
		strcontainer[0]="Praveen";
		strcontainer[1]="654346464564";
		strcontainer[2]="$%^&*#$";
		strcontainer[3]="hsjhskg";
		strcontainer[4]="()()()()())(()";
		
		
		
		for(String str:strcontainer) {
			System.out.println(str);
		}
	}

}
