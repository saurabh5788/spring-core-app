package com.beans.customer;

import java.util.Set;

import com.beans.account.Account;

public class Person implements Customer{
	private Integer id;
	private String fName;
	private String lName;
	private Set<Account> accounts;
}
