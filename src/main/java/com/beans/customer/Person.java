package com.beans.customer;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.beans.account.Account;

public class Person implements Customer {
	private Integer id;
	private String fName;
	private String lName;
	
	@Autowired(required = false)
	private Set<Account> accounts;

	public Person(Integer id, String fName, String lName) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", accounts=" + accounts + "]";
	}
}
