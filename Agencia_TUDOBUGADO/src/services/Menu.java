package services;

import java.util.Scanner;

public class Menu {

	private Integer opcao;
	private Scanner sc;

	public Menu() {
		Scanner sc = new Scanner(System.in);
	}

	public Integer getOpcao() {
		System.out.println("Menu");
		System.out.println("1: Cadastrar Conta");
		System.out.println("2: Alterar Conta");
		System.out.println("3: Remover Conta");
		System.out.println("4: See account Data");
		System.out.println("5: Deposit ");
		System.out.println("6: Withdraw");
		System.out.println("7 : Exit");
		System.out.println("Sua opcao");
		try {
			
			if(opcao < 1 || opcao > 4) {
				System.out.println("Opcao Invalida. Tente novamente");
				getOpcao();
			}
		} catch (Exception error) {
			System.out.println("Ocorreu um erro inexperado ao tentar executar o Menu.");
			getOpcao();
		}
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}

}
