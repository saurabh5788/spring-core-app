package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class TestComputer implements Computer {
	
	@Autowired
	//@Qualifier("mic3")
	private Microprocessor intelmicroprocesso;
	public Microprocessor getMicroprocessor() {
		return intelmicroprocesso;
	}

	public void setMicroprocessor(Microprocessor microprocessor) {
		this.intelmicroprocesso = microprocessor;
	}
	
	@Override
	public String toString() {
		return getClass().getName()+" : [microprocessor=" + intelmicroprocesso
				+ ", getMicroprocessor()=" + getMicroprocessor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
