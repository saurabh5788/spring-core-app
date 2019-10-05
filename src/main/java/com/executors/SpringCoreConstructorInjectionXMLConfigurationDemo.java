package com.executors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Computer;

public class SpringCoreConstructorInjectionXMLConfigurationDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCoreConstructorInjection.xml");
		System.out.println("Application context loaded!!!");
		
		Computer computer = applicationContext.getBean(Computer.class);
		System.out.println(computer.toString());
		applicationContext.close();
	}
}
