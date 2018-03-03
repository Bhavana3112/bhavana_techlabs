package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account(1, "abc", 1000);
		Account a2 = new Account(2, "xyz");
		Account a3 = new Account(3, "abcd");
		a1.deposit(500);
		a2.deposit(100);
		a1.withdraw(500);
		a2.withdraw(500);

		printDetails(a1);
		printDetails(a2);
		printDetails(a3);

	}

	public static void printDetails(Account acc) {
		
		System.out.println("accno = " + acc.getAccno() + " name = "
				+ acc.getName() + " balance = " + acc.getBalance());
		System.out.println(acc.getAccHolder());
		System.out.println(Account.getHeadCount());
		

	}
}
