package com.configurations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.beans.AMDMicroprocessor;
import com.beans.Microprocessor;

@Configuration
@Lazy(true)
@Description("Java Based Bean Configurations class")
public class SpringCoreSimpleBeanConfiguration {
	@Bean
	@Description("Bean configuration with minimal configuration only with class.")
	public Microprocessor getAMDMicroprocessor(){
		return new AMDMicroprocessor();
	}
	@Bean(name={"singletoneagermicroprocessor","mainprocessor","amdmicroprocessor"})
	@Description("Eager Bean configuration with names.")
	@Lazy(false)
	public Microprocessor getSingletonEagerMicroprocessor(){
		return new AMDMicroprocessor();
	}
	
	@Bean(name={"prototypemicroprocessor"})
	@Description("Bean configuration with name and scope.")
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Microprocessor getPrototypeMicroprocessor(){
		return new AMDMicroprocessor();
	}
}