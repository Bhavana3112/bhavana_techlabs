package com.techlabs.customer;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	private int custid;
	private String firstname;
	private String lastname;
	private int moneyspent;
	private static final AtomicInteger count = new AtomicInteger(1000); 
	public Customer(String firstname, String lastname,
			int moneyspent) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.moneyspent = moneyspent;
	    custid = count.incrementAndGet(); 

		this.custid=getCustid();
	}
	public int getCustid() {
		return custid;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMoneyspent() {
		return moneyspent;
	}
	public static AtomicInteger getCount(){
		return count;
	}
	
	
}
