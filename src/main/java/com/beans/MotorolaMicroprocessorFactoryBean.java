package com.beans;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class MotorolaMicroprocessorFactoryBean extends
		AbstractFactoryBean<Object> {

	private int n;
	private int m;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	@Override
	protected Microprocessor createInstance() throws Exception {
		Microprocessor microprocessor = new MotorolaMicroprocessor(n, m);
		System.out.println("Bean created from Factory Bean!!!");
		return microprocessor;
	}

	@Override
	public Class<MotorolaMicroprocessor> getObjectType() {
		System.out.println("getObjectType() called!!!");
		return MotorolaMicroprocessor.class;
	}

}
