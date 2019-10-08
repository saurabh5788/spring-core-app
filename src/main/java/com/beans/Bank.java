package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.beans.account.Account;
import com.beans.customer.Customer;

public class Bank {
	@Autowired(required = false)
	Set<Account> accounts;
	List<Customer> customers;

	@Autowired(required = false)
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	Map<Account,Customer> accountCustomerMap;
	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + ", customers=" + customers
				+ ", accountCustomerMap=" + accountCustomerMap + "]";
	}
}
