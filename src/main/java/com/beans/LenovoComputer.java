package com.beans;

public class LenovoComputer implements Computer{
	private Microprocessor microprocessor;

	public LenovoComputer(Microprocessor microprocessor) {
		System.out.println(getClass().getName()+" : 1 Arg Constructor Called!!!");
		this.microprocessor = microprocessor;
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
