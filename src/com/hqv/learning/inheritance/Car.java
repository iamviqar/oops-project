package com.hqv.learning.inheritance;

public class Car {
	
	public String wheels;
	public String Steering;
	public String windShield;
	
	void drive() {
		System.out.println("inside drive method");
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", Steering=" + Steering + ", windShield=" + windShield + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((Steering == null) ? 0 : Steering.hashCode());
	 * result = prime * result + ((wheels == null) ? 0 : wheels.hashCode()); result
	 * = prime * result + ((windShield == null) ? 0 : windShield.hashCode()); return
	 * result; }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Steering == null) {
			if (other.Steering != null)
				return false;
		} else if (!Steering.equals(other.Steering))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		if (windShield == null) {
			if (other.windShield != null)
				return false;
		} else if (!windShield.equals(other.windShield))
			return false;
		return true;
	}
	
	
	
	

}
