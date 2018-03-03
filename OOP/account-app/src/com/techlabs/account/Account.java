package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private static int accholder;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		if (balance < 500) {
			this.balance = 500;
		}
		accholder++;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		this.balance = this.getBalance() + amt;
	}

	public void withdraw(double amt) {
		if (this.balance - amt >= 500)
			this.balance = this.balance - amt;
		
	}

	public int getAccHolder() {
		return accholder;

	}
	public static int getHeadCount(){
		return accholder;
	}
}
