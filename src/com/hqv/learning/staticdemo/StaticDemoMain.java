package com.hqv.learning.staticdemo;

public class StaticDemoMain {
	
	public static void main(String args[]) {
		/*
		 * for (int i = 0; i < args.length; i++) { System.out.println(args[i]); }
		 */
		
		StaticDemo sd = new StaticDemo("dsadas");
		
		StaticDemo sd1 = new StaticDemo();
		
		StaticDemo.b = 30;
		
		System.out.println("Value of b is : "+ StaticDemo.b); // 30
		
		sd.b = 40 ;
		sd.a = 100;
		
		System.out.println("Value of b from StaticDemo is : "+ StaticDemo.b); //30, 40
		System.out.println("Value of b from sd object is : "+ sd.b); // 40
		System.out.println("Value of a from sd object is : "+ sd.a);
		
		/*
		 * sd1.b = 50; sd1.a = 200;
		 */
		System.out.println("Value of b from StaticDemo is : "+ StaticDemo.b); // 50
		System.out.println("Value of b from sd object is : "+ sd.b); // 50
		//System.out.println("Value of b from sd1 object is : "+ sd1.b); // 50
		//System.out.println("Value of a from sd1 object is : "+ sd1.a); // 200
		
	}
	
	/*
	 * int add(int a, int b) { return a+b; }
	 * 
	 * int add(int a, int b,int c) { return a+b+c; }
	 */
	
	

}
