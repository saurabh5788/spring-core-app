package com.executors;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.beans.Computer;
import com.beans.Microprocessor;
public class SpringCoreIoCDemo {
	public static void main(String[] args) {
		Microprocessor microprocessor = null;
		//BeanFactory
		Resource resource = new ClassPathResource("SpringCoreIoC_1.xml");
		//Resource resource = new FileSystemResource("C:\\...\\beans_1.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/*InputStream is = new FileInputStream("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(is);*/		
		microprocessor = beanFactory.getBean(Microprocessor.class);
		System.out.println(microprocessor.toString());
		// DefaultListableBeanFactory
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("SpringCoreIoC_1.xml"));
		microprocessor = defaultListableBeanFactory.getBean(Microprocessor.class);
		System.out.println(microprocessor.toString());		
		//Application Context
		Computer computer = null;
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCoreIoC_1.xml","SpringCoreIoC_2.xml");
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames){
			System.out.println("-"+beanName);
		}
		//AbstractApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\...\\beans_1.xml");
		microprocessor = (Microprocessor) applicationContext.getBean(Microprocessor.class);
		computer = (Computer) applicationContext.getBean(Computer.class);
		applicationContext.close();
		System.out.println(microprocessor.toString());	
		System.out.println(computer.toString());	
	}
}
