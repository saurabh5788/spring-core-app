package com.executors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreImportXMLConfigurationDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCoreImportConfiguration.xml");
		System.out.println("Application context loaded!!!");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}		
		applicationContext.close();
	}
}
