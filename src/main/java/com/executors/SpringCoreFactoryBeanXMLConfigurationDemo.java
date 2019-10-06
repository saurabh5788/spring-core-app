package com.executors;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Microprocessor;

public class SpringCoreFactoryBeanXMLConfigurationDemo {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"SpringCoreFactoryBeanConfiguration.xml");
		System.out.println("Application context loaded!!!");

		Microprocessor microprocessor = applicationContext.getBean("microprocessor", Microprocessor.class);
		System.out.println(microprocessor.toString());

		FactoryBean<Microprocessor> afb = (FactoryBean<Microprocessor>) applicationContext.getBean("&microprocessor");
		System.out.println(afb.getObject());
		System.out.println(afb.getObjectType());

		applicationContext.close();
	}
}
