package com.hqv.learning.inheritance;

import com.hqv.learning.interfaces.CarInterface;

public class InheritanceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Car c = new Car(); c.drive();
		 * 
		 * Suv s = new Suv(); s.drive();
		 */
		
		
		//referring child class object with parent class variable
		/*
		 * Car c1 = new Suv(); c1.drive();
		 */
		
		//instantiating the abstraction or creating object for abstract class
		
		//AbstractCar ac = new AbstractCar();
		
		//instantiating the child class having parent abstract class
		
		/*
		 * SuvWithAbstractCar swac = new SuvWithAbstractCar(); swac.drive();
		 */
		
		CarInterface ci = new CarImpl();
		CarImpl cii = new CarImpl();
		ci.drive();
		//ci.autoPilotOn(); // cannot call this method since interface is missing with declaration of same
		cii.autoPilotOn();
	}

}
