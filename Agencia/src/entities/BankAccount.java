package entities;

public class BankAccount {
	private int number;
	private String holder;
	private double balance;

	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value + 5;
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $%.2f", number, holder, balance);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

}
