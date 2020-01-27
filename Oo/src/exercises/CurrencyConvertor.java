package exercises;

import java.util.Scanner;

public class CurrencyConvertor {
	private double cotacao;
	private double dollar;
	private final double IOF = 6.0;
	private Scanner sc;

	public CurrencyConvertor() {
		this.sc = new Scanner(System.in);
	}

	public void readvalors() {
		System.out.println("What is the dollar price?");
		cotacao = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		dollar = sc.nextDouble();
	}

	public double convertDollarsToReais(double dollar, double cotacao) {
		dollar = dollar + dollar * 0.06;
		return dollar * cotacao;
	}

	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

	public double getDollar() {
		return dollar;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}

	public double getIOF() {
		return IOF;
	}

}
