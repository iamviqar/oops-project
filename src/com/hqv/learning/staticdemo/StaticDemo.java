package com.hqv.learning.staticdemo;

public class StaticDemo {
	static {
		
		System.out.println("inside StaticDemo static block");
		
	}
	
	StaticDemo(){
		System.out.println("inside StaticDemo constructor");
	}
	
	StaticDemo(String str1){
		System.out.println("inside StaticDemo Param constructor");
	}
	
	
	int a =10;
	static int b=20;

}
