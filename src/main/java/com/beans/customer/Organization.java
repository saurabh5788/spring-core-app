package com.beans.customer;

import java.util.Set;

import com.beans.account.Account;

public class Organization implements Customer{
	private Integer id;
	private String name;
	private Set<Account> accounts;
	
}
