package com.executor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Microprocessor;

public class SpringCoreBeanXMLDefinitionDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_3.xml");
		System.out.println("Application context loaded!!!");
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}
		Microprocessor singletonmicroprocessor = (Microprocessor) applicationContext.getBean("singletonmicroprocessor", Microprocessor.class);
		System.out.println(singletonmicroprocessor.toString());
		String [] singletonmicroprocessorAliases = applicationContext.getAliases("singletonmicroprocessor");
		for(String aliasName : singletonmicroprocessorAliases){
			System.out.println("-"+aliasName);
		}
		
		Microprocessor prototypemicroprocessor = (Microprocessor) applicationContext.getBean("prototypemicroprocessor", Microprocessor.class);
		System.out.println(prototypemicroprocessor.toString());
		prototypemicroprocessor = (Microprocessor) applicationContext.getBean("prototypemicroprocessor", Microprocessor.class);
		System.out.println(prototypemicroprocessor.toString());
		
		applicationContext.close();
	}
}
