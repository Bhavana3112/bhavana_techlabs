package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("abc", "xyz", 400);
		Customer c2 = new Customer("pooja", "pawar", 600);
		printDetails(c1);
		printDetails(c2);

	}

	public static void printDetails(Customer c) {
		System.out.println("custid= " + c.getCustid() + " cust_firstname= "
				+ c.getFirstname() + " cust_lastname = " + c.getLastname()
				+ " moneyspent= " + c.getMoneyspent());

	}

}
