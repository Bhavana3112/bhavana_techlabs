package com.techlabs.customer;

public class Customer {
	private int custid;
	private String firstname;
	private String lastname;
	private int moneyspent;
	private static int count;
	public Customer(String firstname, String lastname,
			int moneyspent) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.moneyspent = moneyspent;
		count++;
		this.custid=getCustid();
	}
	public int getCustid() {
		return 1000+count;
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
	public static int getCount(){
		return count;
	}
	
	
}
