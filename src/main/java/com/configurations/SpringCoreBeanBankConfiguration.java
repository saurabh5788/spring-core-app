package com.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.beans.Bank;

@Configuration
@ComponentScan({"com.beans.account","com.beans.customer"})
public class SpringCoreBeanBankConfiguration {
	@Bean
	@Primary
	public Bank getBank(){
		System.out.println("Bank : Creating bean using @Bean");
		Bank bank = new Bank();
		System.out.println(bank);
		return bank;
	}
}
