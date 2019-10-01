package com.beans;

public class HPComputer implements Computer{
	private Microprocessor microprocessor;

	public HPComputer() {
		this.microprocessor = new AMDMicroprocessor();
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

