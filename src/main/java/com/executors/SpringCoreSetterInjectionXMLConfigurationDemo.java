package com.executors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Computer;

public class SpringCoreSetterInjectionXMLConfigurationDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCoreSetterInjectionConfiguration.xml");
		System.out.println("Application context loaded!!!");
		
		Computer computer = applicationContext.getBean(Computer.class);
		System.out.println(computer.toString());
		applicationContext.close();
	}
}
