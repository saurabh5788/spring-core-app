package com.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configuration.SpringCoreBeanJavaDefinition;

public class SpringCoreBeanJavaDefinitionDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreBeanJavaDefinition.class);
		System.out.println("Application context loaded!!!");
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}
		applicationContext.close();
	}
}
