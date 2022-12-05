package com.project.customarray;

public class Tester {
	public static void main(String[] args) {
		Car car=new Car(100000,"Red",25,"Hyundai I 20",2019, true);
		Car car1=new Car(120000,"White",20, "Toyota", 2018, false);
		Car car3=new Car(1500000, "Black", 18,"Rollsroyce",2020 , true);
		Car car4=new Car(1200000,"Brown",28,"Honda", 2020, true); 
		
		
		
		Car[] container=new Car[4];
		container[0]=car;
		container[1]=car1;
		container[2]=car3;
		container[3]=car4;
		
		
		for(Car cr:container) {
			System.out.println(cr); 
		}
	}
		
	}
