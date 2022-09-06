package com.hqv.learning.inheritance;

import com.hqv.learning.interfaces.CarInterface;

public class CarImpl implements CarInterface {

	@Override
	public void drive() {
		
		System.out.println("Inside CarImpl");
		
	}
	
	public void autoPilotOn() {
		System.out.println("inside CarImpl:autoPilotOn()");
	}

	@Override
	public void someGenericMethod() {
		System.out.println("Inside CarImpl:someGenericMethod()");
		
	}

}
