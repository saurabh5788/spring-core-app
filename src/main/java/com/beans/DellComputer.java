package com.beans;

public class DellComputer implements Computer{
	private Microprocessor microprocessor;

	public DellComputer() {
		System.out.println(getClass().getName()+" : No Args Constructor Called!!!");
	}

	public Microprocessor getMicroprocessor() {
		return microprocessor;
	}

	public void setMicroprocessor(Microprocessor microprocessor) {
		this.microprocessor = microprocessor;
	}
	
	@Override
	public String toString() {
		return getClass().getName()+" : [microprocessor=" + microprocessor
				+ ", getMicroprocessor()=" + getMicroprocessor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
