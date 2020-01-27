package entities;

import java.awt.List;
import java.util.ArrayList;


public class Account {
	//Account Number, Holder, Balance
	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account() {
	}
	public Account(int accountNumber, String holder) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public String toString() {
		System.out.println("Account Data:");
		String text;
		return text =  String.format("Account %d, Holder: %s, Balance: %.2f", accountNumber,holder,balance);
	}

}
