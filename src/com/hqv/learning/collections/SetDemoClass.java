package com.hqv.learning.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoClass {
	
	public static void main(String args[]) {
		
		Set<String> strSetHash = new HashSet(); // order of insertion is not maintained
		
		strSetHash.add("item1");
		strSetHash.add("item2");
		strSetHash.add("item3");
		strSetHash.add("item5");
		strSetHash.add("item4");
		strSetHash.add("item4");
		
		System.out.println(strSetHash);
		
		Set<String> strSetTree = new TreeSet(); // order of insertion is sorted
		strSetTree.add("item1");
		strSetTree.add("item2");
		strSetTree.add("item3");
		strSetTree.add("item5");
		strSetTree.add("item4");
		strSetTree.add("item4");
		
		System.out.println(strSetHash);
		
	}

}
