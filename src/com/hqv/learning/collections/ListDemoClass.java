package com.hqv.learning.collections;

import java.util.ArrayList;
import java.util.List;

import com.hqv.learning.inheritance.Car;

public class ListDemoClass {

	
	public static void main(String args[]) {
		List<String> strList = new ArrayList<String>();
		
		List<String> str1List = new ArrayList();
		
		List str2List = new ArrayList();
		
		System.out.println(strList.add("item1"));
		strList.add("item2");
		strList.add("item4");
		strList.add("item3"); // list maintains the order of insertion
		strList.add("item3");
		System.out.println(strList);
		
		str1List.add("item2");
		str1List.add("item4");
		str1List.add("item3");
		str1List.add("item53");
		System.out.println(str1List);
		
		
		str2List.add(1);
		str2List.add("item4");
		str2List.add(2.54);
		System.out.println(str2List);
		
		System.out.println(strList.get(1)); // indexing starts from 0
		
		System.out.println(str1List.contains("item43"));
		
		System.out.println(strList.containsAll(str1List));
		
		
		List<Car> carList = new ArrayList();
		Car c1 = new Car();
		c1.wheels = "MRF";
		c1.windShield="C1";
		c1.Steering="C2";
		carList.add(c1);
		Car c2 =c1;
		/*
		 * c2.wheels = "MRF"; c2.windShield="C1"; c2.Steering="C2";
		 */
		carList.add(c2);
		System.out.println(carList);
		
		// equals
		System.out.println(c1==c2);
		
		System.out.println(c1.equals(c2));
		
		// set
		// map
		
		
	}
}
