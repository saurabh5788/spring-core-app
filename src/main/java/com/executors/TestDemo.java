package com.executors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.beans.Computer;
import com.configurations.TestConfiguration;

public class TestDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
		Computer c = (Computer) applicationContext.getBean("&testComputer");
		System.out.println(c.toString());
		applicationContext.close();
	}
}
