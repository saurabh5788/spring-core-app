package com.beans;

public class MotorolaMicroprocessor implements Microprocessor{
	private int noOfCores;
	private int memory;
	public MotorolaMicroprocessor(){
		System.out.println(getClass().getName()+" : No Args Constructor Called!!!");
	}
	public MotorolaMicroprocessor(int noOfCores){
		System.out.println(getClass().getName()+" : 1 Arg Constructor Called!!!");
		this.noOfCores = noOfCores;
	}
	public MotorolaMicroprocessor(int n, int m){
		System.out.println(getClass().getName()+" : 2 Args Constructor Called!!!");
		this.noOfCores = n;
		this.memory = m;
	}
	@Override
	public String toString() {
		return "MotorolaMicroprocessor [noOfCores=" + noOfCores + ", memory="
				+ memory + "]";
	}
}
