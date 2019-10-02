package com.executors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configurations.SpringCoreBeanDefinition;

public class SpringCoreBeanJavaDefinitionDemo {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreBeanDefinition.class);
		System.out.println("Application context loaded!!!");
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}
		applicationContext.close();
	}
}
