package com.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="intelmicroprocessor")
@Qualifier(value="123")
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
@Lazy(true)
@Description("Annotation Based defined Bean class")
public class IntelMicroprocessor implements Microprocessor{
	public IntelMicroprocessor(){
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
