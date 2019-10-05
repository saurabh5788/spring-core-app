package com.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.AMDMicroprocessor;
import com.beans.Computer;
import com.beans.LenovoComputer;
import com.beans.Microprocessor;

@Configuration
@ComponentScan({"com.beans"})
public class TestConfiguration {
	@Bean(name="intelmicroprocesso")
	//@Qualifier("intelmicroprocesso")
	public Microprocessor getSingletonEagerMicroprocessor(){
		return new AMDMicroprocessor();
	}
	
	@Bean
	public Computer getComputer(Microprocessor intelmicroprocesso){
		Computer c = new LenovoComputer(intelmicroprocesso);
		return c;
	}
}
