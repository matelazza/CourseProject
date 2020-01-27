package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entities.Account;

public class AccountController {

	private static List<Account> listAccounts = new ArrayList<Account>();
	private Scanner sc;

	public AccountController() {
		this.sc = new Scanner(System.in);
	}

	// Criação de conta
	// Alteracao de Conta
	// Remocao
	public int geraId() {
		Random random = new Random();
		int number = random.nextInt(4);
		return number;
	}

	public void createAccount() {
		Account account = new Account();
		System.out.println("O número de sua conta sera gerado automaticamente:");
		account.setAccountNumber(geraId());
		System.out.println("Numero da Conta = " + account.getAccountNumber());
		System.out.println("Uma vez definido o numero da conta, nao podera ser alterado.");
		System.out.println("Informe seu nome:");
		String text = sc.nextLine();
		account.setHolder(text);
		Boolean ver = initialDepositVerification();
		if(ver = true) {
			System.out.println("Enter the initial deposit value:");
			double value = sc.nextDouble();
			depositAccount();
			System.out.println(account);
			listAccounts.add(account);

		}
		else {
			System.out.println(account);
			listAccounts.add(account);
		}
		
	}

	public Boolean initialDepositVerification() {
		System.out.println("Is there an Initial Deposit (y/n)?");
		char c = sc.next().toLowerCase().charAt(0);
		Boolean ver;
		if (c == 's') {
			return	ver = true;
			} else {
			return	ver = false;
			}
		
	}

	public void alterAccount() {

	}

	public void deleteAccount() {

	}

	public void seeAccount() {
		System.out.println("Enter the account number:");
		int number = sc.nextInt();
		boolean ver = false;
		Account account = new Account();
		for(int i = 0; i < listAccounts.size();i++) {
		if(number == account.getAccountNumber()) {
			ver = true;
			break;
			}
		}
		if(ver == true) {
			System.out.println(account);
		}
		else {System.out.println("Ocorreu um erro inexperado na execucao de visualização da conta.");}
		
	}

	public void depositAccount() {
		
	}

	public void withdrawAccount() {

	}

	public static List getAccounts() {
		return listAccounts;
	}

	public static void setListAccounts(List accounts) {
		AccountController.listAccounts = accounts;
	}

}
