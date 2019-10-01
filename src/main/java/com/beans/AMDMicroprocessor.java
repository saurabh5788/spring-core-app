package com.beans;

public class AMDMicroprocessor implements Microprocessor{
	public AMDMicroprocessor(){
		System.out.println(getClass().getName()+" : No Args Constructor Called!!!");
	}
	private int noOfCores;

	public int getNoOfCores() {
		return noOfCores;
	}

	public void setNoOfCores(int noOfCores) {
		this.noOfCores = noOfCores;
	}

	@Override
	public String toString() {
		return getClass().getName()+" : [noOfCores=" + noOfCores
				+ ", getNoOfCores()=" + getNoOfCores() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
