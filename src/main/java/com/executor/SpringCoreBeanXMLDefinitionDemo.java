package com.executor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Microprocessor;

public class SpringCoreBeanXMLDefinitionDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCoreBeanXMLDefinitionDemo_Beans_1.xml");
		System.out.println("Application context loaded!!!");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}
		Microprocessor singletoneagermicroprocessor = (Microprocessor) applicationContext.getBean("singletoneagermicroprocessor", Microprocessor.class);
		System.out.println(singletoneagermicroprocessor.toString());
		String [] singletoneagermicroprocessorAliases = applicationContext.getAliases("singletoneagermicroprocessor");
		for(String aliasName : singletoneagermicroprocessorAliases){
			System.out.println("-"+aliasName);
		}
		
		Microprocessor prototypemicroprocessor = (Microprocessor) applicationContext.getBean("prototypemicroprocessor", Microprocessor.class);
		System.out.println(prototypemicroprocessor.toString());
		prototypemicroprocessor = (Microprocessor) applicationContext.getBean("prototypemicroprocessor", Microprocessor.class);
		System.out.println(prototypemicroprocessor.toString());
		
		applicationContext.close();
	}
}
