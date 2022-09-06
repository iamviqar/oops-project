package com.hqv.learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoClass {
	public static void main(String args[]) {
		
		
		Map<String,String> map1 = new HashMap(); // order of insertion is not maintained
		map1.put("R001", "Student 1");
		map1.put("R002", "Student 2");
		map1.put("R003", "Student 3");
		map1.put("R004", "Student 4");
		map1.put("R004", "Student 4");
		map1.put("R005", "Student 4");
		
		System.out.println(map1);
		
		Map<String,String> map2 = new TreeMap(); // order of insertion is not maintained but sorted based on key value
		map2.put("R001", "Student 1");
		map2.put("R002", "Student 2");
		map2.put("R003", "Student 3");
		map2.put("R005", "Student 4");
		map2.put("R004", "Student 4");
		
		System.out.println(map2);
	}

}
