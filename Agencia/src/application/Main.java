package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		BankAccount account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		}
		else {
			account = new BankAccount(number, holder);

		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account);
		System.out.println("");
		
		System.out.println("Enter a deposit value:");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated Account Data:");
		System.out.println(account);
		
		System.out.println("Enter a withdraw vaue:");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Updated Account Data:");
		System.out.println(account);
		sc.close();
	}

}
